package com.shoyeb.service;

import com.shoyeb.BookRequest;
import com.shoyeb.BookResponse;
import com.shoyeb.BookServiceGrpc;
import com.shoyeb.dto.BookDto;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class BookServiceClient {

    // Injecting the gRPC Stub
    @GrpcClient("book-service")
    private BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub;
    public BookDto findBookByTitle(String title) {
        BookRequest request = BookRequest.newBuilder()
                .setBookTitle(title)
                .build();

        BookResponse response = bookServiceBlockingStub.findBookByTitle(request);

        return new BookDto(
                response.getBookId(),
                response.getBookTitle(),
                response.getAuthor(),
                response.getBookPrice()
        );
    }
}
