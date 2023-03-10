package org.example.lambda.requestresponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamLambda {

    /**
     * to test use "my simple text"
     */
    public void handlerStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        int letter;
        while ((letter = inputStream.read()) != -1) {
            outputStream.write(Character.toUpperCase(letter));
        }
    }
}