package defpackage;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mcs extends mcv implements mdq, mhl {
    public static final Logger q = Logger.getLogger(mcs.class.getName());
    private mbc a;
    private volatile boolean b;
    private final mhm c;

    /* JADX INFO: Access modifiers changed from: protected */
    public mcs(mjt mjtVar, mbc mbcVar, lys lysVar) {
        Boolean.TRUE.equals(lysVar.e(mfh.k));
        this.c = new mhm(this, mjtVar);
        this.a = mbcVar;
    }

    @Override // defpackage.mcv
    public /* bridge */ /* synthetic */ mcu b() {
        throw null;
    }

    protected abstract mcu e();

    protected abstract njz f();

    @Override // defpackage.mdq
    public final void g(mfm mfmVar) {
        mfmVar.b("remote_addr", a().a(lzr.a));
    }

    @Override // defpackage.mdq
    public final void h(mca mcaVar) {
        hwx.K(!mcaVar.f(), "Should not cancel with OK status");
        this.b = true;
        njz f = f();
        mfk mfkVar = ((mco) f.a).p;
        maz mazVar = mfk.n;
        synchronized (mfkVar.s) {
            mfk mfkVar2 = ((mco) f.a).p;
            if (mfkVar2.v) {
                return;
            }
            mfkVar2.v = true;
            mfkVar2.x = mcaVar;
            Iterator it = mfkVar2.t.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) ((mcn) it.next()).c).clear();
            }
            mfkVar2.t.clear();
            Object obj = f.a;
            BidirectionalStream bidirectionalStream = ((mco) obj).k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                ((mco) obj).i.d((mco) obj, mcaVar);
            }
        }
    }

    @Override // defpackage.mdq
    public final void i() {
        if (!e().k) {
            e().k = true;
            mhm p = p();
            if (!p.f) {
                p.f = true;
                ktf ktfVar = p.j;
                if (ktfVar != null && ktfVar.b() == 0 && p.j != null) {
                    p.j = null;
                }
                p.b(true, true);
            }
        }
    }

    @Override // defpackage.mdq
    public final void j(lzj lzjVar) {
        this.a.c(mfh.a);
        this.a.e(mfh.a, Long.valueOf(Math.max(0L, lzjVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.mdq
    public final void k(lzm lzmVar) {
        boolean z;
        mcu e = e();
        if (e.i == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Already called start");
        lzmVar.getClass();
        e.j = lzmVar;
    }

    @Override // defpackage.mdq
    public final void l(int i) {
        e().m.b = i;
    }

    @Override // defpackage.mdq
    public final void m(int i) {
        boolean z;
        mhm mhmVar = this.c;
        if (mhmVar.a == -1) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "max size already set");
        mhmVar.a = i;
    }

    @Override // defpackage.mdq
    public final void n(mds mdsVar) {
        boolean z;
        int i;
        mcu e = e();
        if (e.i == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Already called setListener");
        e.i = mdsVar;
        njz f = f();
        ((mco) f.a).j.run();
        mco mcoVar = (mco) f.a;
        mcl mclVar = mcoVar.o;
        if (mclVar != null) {
            mcm mcmVar = new mcm(mcoVar);
            String str = mcoVar.d;
            Executor executor = mcoVar.g;
            boolean z2 = mclVar.b;
            BidirectionalStream.Builder newBidirectionalStreamBuilder = mclVar.a.newBidirectionalStreamBuilder(str, mcmVar, executor);
            if (z2) {
                newBidirectionalStreamBuilder.setTrafficStatsTag(mclVar.c);
            }
            if (mclVar.d) {
                newBidirectionalStreamBuilder.setTrafficStatsUid(mclVar.e);
            }
            if (((mco) f.a).l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            mco mcoVar2 = (mco) f.a;
            Object obj = mcoVar2.m;
            if (obj != null || mcoVar2.n != null) {
                if (obj != null) {
                    newBidirectionalStreamBuilder.addRequestAnnotation(obj);
                }
                Collection collection = ((mco) f.a).n;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        newBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                    }
                }
            }
            mco mcoVar3 = (mco) f.a;
            newBidirectionalStreamBuilder.addHeader(mfh.i.a, mcoVar3.e);
            newBidirectionalStreamBuilder.addHeader(mfh.g.a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            mbc mbcVar = mcoVar3.h;
            Logger logger = mjy.a;
            Charset charset = mab.a;
            int a = mbcVar.a();
            byte[][] bArr = new byte[a];
            Object[] objArr = mbcVar.d;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, mbcVar.a());
            } else {
                for (int i2 = 0; i2 < mbcVar.e; i2++) {
                    int i3 = i2 + i2;
                    bArr[i3] = mbcVar.f(i2);
                    bArr[i3 + 1] = mbcVar.g(i2);
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < a; i5 += 2) {
                byte[] bArr2 = bArr[i5];
                byte[] bArr3 = bArr[i5 + 1];
                if (mjy.a(bArr2, mjy.b)) {
                    i = i4 + 2;
                    bArr[i4] = bArr2;
                    bArr[i4 + 1] = mab.b.k(bArr3).getBytes(jec.a);
                } else {
                    for (byte b : bArr3) {
                        if (b < 32 || b > 126) {
                            mjy.a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr2, jec.a) + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                            break;
                        }
                    }
                    i = i4 + 2;
                    bArr[i4] = bArr2;
                    bArr[i4 + 1] = bArr3;
                }
                i4 = i;
            }
            if (i4 != a) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i4);
            }
            for (int i6 = 0; i6 < bArr.length; i6 += 2) {
                String str2 = new String(bArr[i6], StandardCharsets.UTF_8);
                if (!mfh.g.a.equalsIgnoreCase(str2) && !mfh.i.a.equalsIgnoreCase(str2) && !mfh.h.a.equalsIgnoreCase(str2)) {
                    newBidirectionalStreamBuilder.addHeader(str2, new String(bArr[i6 + 1], StandardCharsets.UTF_8));
                }
            }
            ((mco) f.a).k = newBidirectionalStreamBuilder.build();
            ((mco) f.a).k.start();
        }
        this.a = null;
    }

    @Override // defpackage.mcv, defpackage.mju
    public final boolean o() {
        if (b().b() && !this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mcv
    protected final mhm p() {
        return this.c;
    }

    @Override // defpackage.mhl
    public final void q(ktf ktfVar, boolean z, boolean z2) {
        Object obj;
        boolean z3 = true;
        if (ktfVar == null && !z) {
            z3 = false;
        }
        hwx.K(z3, "null frame before EOS");
        njz f = f();
        mfk mfkVar = ((mco) f.a).p;
        maz mazVar = mfk.n;
        synchronized (mfkVar.s) {
            if (((mco) f.a).p.v) {
                return;
            }
            if (ktfVar != null) {
                obj = ktfVar.b;
                ((Buffer) obj).flip();
            } else {
                obj = mco.a;
            }
            Object obj2 = f.a;
            int remaining = ((ByteBuffer) obj).remaining();
            mfk mfkVar2 = ((mco) obj2).p;
            synchronized (mfkVar2.a) {
                mfkVar2.d += remaining;
            }
            Object obj3 = f.a;
            mfk mfkVar3 = ((mco) obj3).p;
            if (!mfkVar3.u) {
                mfkVar3.t.add(new mcn((ByteBuffer) obj, z, z2));
            } else {
                ((mco) obj3).d((ByteBuffer) obj, z, z2);
            }
        }
    }
}
