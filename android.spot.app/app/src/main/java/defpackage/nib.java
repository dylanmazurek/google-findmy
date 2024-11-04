package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nib extends nhy {
    final /* synthetic */ nie c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nib(nie nieVar, long j) {
        super(nieVar);
        this.c = nieVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.nhy, defpackage.nll
    public final long a(nkp nkpVar, long j) {
        if (!this.a) {
            long j2 = this.d;
            if (j2 == 0) {
                return -1L;
            }
            long a = super.a(nkpVar, Math.min(j2, 8192L));
            if (a != -1) {
                long j3 = this.d - a;
                this.d = j3;
                if (j3 == 0) {
                    c();
                }
                return a;
            }
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !ngt.A(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
