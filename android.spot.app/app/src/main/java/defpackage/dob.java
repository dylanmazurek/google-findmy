package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dob implements dnq {
    public static final dob a = new dob(1, null);
    private final /* synthetic */ int b;

    public dob(int i) {
        this.b = i;
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new gai(dnuVar.a(gaf.class, InputStream.class));
                            }
                            return new gai(dnuVar.a(gaf.class, ByteBuffer.class));
                        }
                        return new gah(dnuVar.a(dnf.class, InputStream.class));
                    }
                    return new gah(dnuVar.a(dnf.class, ByteBuffer.class));
                }
                return new dne(dnuVar.a(dnf.class, InputStream.class), 6);
            }
            return dnt.a;
        }
        return new doc(dnuVar.a(dnf.class, InputStream.class));
    }

    @Deprecated
    public dob(int i, byte[] bArr) {
        this.b = i;
    }
}
