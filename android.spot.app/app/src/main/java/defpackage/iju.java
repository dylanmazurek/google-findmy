package defpackage;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iju extends ikp {
    private final List a;

    public iju(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        hrb.l(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ilc) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ilc) it.next()).a();
        }
    }

    @Override // defpackage.ikp, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (ilc ilcVar : this.a) {
            int length = bArr.length;
            ilcVar.a();
        }
    }

    @Override // defpackage.ikp, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ilc) it.next()).a();
        }
    }
}
