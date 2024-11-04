package j$.nio.file;

import java.nio.file.DirectoryStream;

/* loaded from: classes2.dex */
public final class v implements DirectoryStream.Filter {
    private final DirectoryStream.Filter a;

    public v(DirectoryStream.Filter filter) {
        this.a = filter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public final boolean accept(Object obj) {
        return this.a.accept(AbstractC0029l.c(obj));
    }
}
