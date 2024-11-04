package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaj implements dir {
    public final int b = -1;
    public final int c = -1;
    public final int d = -1;
    private int e;
    private boolean f;
    private Integer g;
    private Integer h;
    private Integer i;

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(0).put((byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    public final int b(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof gaj) {
            gaj gajVar = (gaj) obj;
            int i = gajVar.e;
            boolean z = gajVar.f;
            Integer num = gajVar.g;
            if (amr.i(null, null)) {
                int i2 = gajVar.b;
                int i3 = gajVar.c;
                int i4 = gajVar.d;
                Integer num2 = gajVar.h;
                if (amr.i(null, null)) {
                    Integer num3 = gajVar.i;
                    if (amr.i(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return dtq.c(0, dtq.c(0, dtq.d(null, dtq.c(-1, dtq.c(-1, dtq.c(-1, dtq.c(0, dtq.c(0, 17))))))));
    }

    public final String toString() {
        int i = iac.a;
        return "FifeUrlOptions{  }";
    }
}
