package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* loaded from: classes2.dex */
    public interface Filter<T> {
        boolean accept(T t) throws IOException;
    }

    Iterator<T> iterator();
}
