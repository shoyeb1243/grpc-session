package com.shoyeb.service;

import com.shoyeb.BookRequest;
import com.shoyeb.BookResponse;
import com.shoyeb.BookServiceGrpc;
import com.shoyeb.entity.Book;
import com.shoyeb.repo.BookRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void findBookByTitle(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        String requestBookTitle = request.getBookTitle();
        Book bookTitle = bookRepository.findByBookTitle(requestBookTitle);
        BookResponse bookResponse= BookResponse.newBuilder()
                .setBookId(bookTitle.getBookId())
                .setBookTitle(bookTitle.getBookTitle())
                .setAuthor(bookTitle.getAuthor())
                .setBookPrice(bookTitle.getBookPrice())
                .build();
        responseObserver.onNext(bookResponse);
        responseObserver.onCompleted();
    }
}
