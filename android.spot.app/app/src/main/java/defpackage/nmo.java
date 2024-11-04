package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nmo implements nmy {
    public final /* synthetic */ nmp a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ nmo(nmp nmpVar, boolean z, int i) {
        this.c = i;
        this.a = nmpVar;
        this.b = z;
    }

    @Override // defpackage.nmy
    public final void a() {
        if (this.c != 0) {
            nmp nmpVar = this.a;
            long length = nmpVar.c.getLength();
            nmpVar.e = length;
            if (length == 0) {
                nmpVar.f();
                return;
            }
            if (length > 0 && length < 8192) {
                nmpVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            } else {
                nmpVar.d = ByteBuffer.allocateDirect(8192);
            }
            long j = nmpVar.e;
            if (j > 0) {
                nmpVar.h.setFixedLengthStreamingMode(j);
            } else {
                nmpVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                nmpVar.c();
                return;
            } else {
                nmpVar.a.set(1);
                nmpVar.c.rewind(nmpVar);
                return;
            }
        }
        nmp nmpVar2 = this.a;
        long j2 = nmpVar2.e;
        if (j2 != -1 && j2 - nmpVar2.f < nmpVar2.d.remaining()) {
            nmpVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(nmpVar2.f + nmpVar2.d.remaining()), Long.valueOf(nmpVar2.e))));
            return;
        }
        boolean z = this.b;
        if (nmpVar2.d.remaining() == 0 && !z) {
            nmpVar2.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = nmpVar2.f;
        ByteBuffer byteBuffer = nmpVar2.d;
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += nmpVar2.i.write(byteBuffer);
        }
        nmpVar2.j.flush();
        long j4 = j3 + i;
        nmpVar2.f = j4;
        long j5 = nmpVar2.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                nmpVar2.f();
                return;
            } else if (j5 == j4) {
                nmpVar2.f();
                return;
            } else {
                nmpVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(nmpVar2.f), Long.valueOf(nmpVar2.e))));
                return;
            }
        }
        nmpVar2.a.set(0);
        nmpVar2.b();
    }
}
