package defpackage;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mco extends mcs {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final lyr b = new lyr("cronet-annotation", null);
    public static final lyr c = new lyr("cronet-annotations", null);
    public final String d;
    public final String e;
    public final mjt f;
    public final Executor g;
    public final mbc h;
    public final mcq i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public mcl o;
    public final mfk p;
    private final njz r;

    public mco(String str, String str2, Executor executor, mbc mbcVar, mcq mcqVar, Runnable runnable, Object obj, int i, mbg mbgVar, mjt mjtVar, lys lysVar, mjz mjzVar) {
        super(mjtVar, mbcVar, lysVar);
        boolean z;
        this.r = new njz(this, null);
        this.d = str;
        this.e = str2;
        this.f = mjtVar;
        this.g = executor;
        this.h = mbcVar;
        this.i = mcqVar;
        this.j = runnable;
        if (mbgVar.a == mbf.UNARY) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = lysVar.e(b);
        this.n = (Collection) lysVar.e(c);
        this.p = new mfk(this, i, mjtVar, obj, mjzVar);
        s();
    }

    @Override // defpackage.mdq
    public final lyp a() {
        return lyp.a;
    }

    @Override // defpackage.mcs, defpackage.mcv
    public final /* synthetic */ mcu b() {
        return this.p;
    }

    public final void c(mca mcaVar) {
        this.i.d(this, mcaVar);
    }

    public final void d(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.k;
        if (bidirectionalStream != null) {
            bidirectionalStream.write(byteBuffer, z);
            if (z2) {
                this.k.flush();
            }
        }
    }

    @Override // defpackage.mcs
    protected final /* synthetic */ mcu e() {
        return this.p;
    }

    @Override // defpackage.mcs
    protected final /* synthetic */ njz f() {
        return this.r;
    }
}
