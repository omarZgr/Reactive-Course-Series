package assignment;

import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    private static final Path PATH = Paths.get("C:\\Users\\samsung\\Desktop\\MasterClass-spring framework\\WorkShop\\Reactive\\Reactor\\project01\\src\\main\\java\\assignment");

    public static Mono<String> read(String fileName)
    {
        return Mono.fromSupplier(() -> {
            try {
                return readFile(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }) ;
    }

    public static Mono<Void> write(String fileName,String content)
    {
        return Mono.fromRunnable( () -> {
            try {
                writeFile(fileName,content);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }) ;

    }

    public static Mono<Void> delete(String fileName)
    {
        return Mono.fromRunnable( () -> {
            try {
                deleteFile(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }) ;


    }

    private static String readFile(String fileName) throws IOException {
        return Files.readString(PATH.resolve(fileName)) ;
    }

    private static void writeFile(String fileName,String content) throws IOException {
         Files.writeString(PATH.resolve(fileName),content) ;
    }

    private static void deleteFile(String fileName) throws IOException {
        Files.delete(PATH.resolve(fileName)) ;
    }
}
