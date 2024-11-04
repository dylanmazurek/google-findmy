package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrt extends ByteArrayOutputStream {
    public jrt(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.count;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b() {
        return this.buf;
    }
}
