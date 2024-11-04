package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhj extends ByteArrayOutputStream {
    final /* synthetic */ dhk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhj(dhk dhkVar, int i) {
        super(i);
        this.a = dhkVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i;
        if (this.count > 0 && this.buf[this.count - 1] == 13) {
            i = this.count - 1;
        } else {
            i = this.count;
        }
        try {
            return new String(this.buf, 0, i, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
