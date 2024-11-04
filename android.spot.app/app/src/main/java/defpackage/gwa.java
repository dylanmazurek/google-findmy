package defpackage;

import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwa implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final /* synthetic */ int d;

    public gwa(mko mkoVar, mko mkoVar2, mko mkoVar3, int i) {
        this.d = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        Object jmsVar;
        switch (this.d) {
            case 0:
                return new ktn(((lry) this.a).b(), (gsg) this.b.a(), (jer) ((lsi) this.c).b);
            case 1:
                mko mkoVar = this.b;
                return new gsv(((lry) this.c).b(), lsg.c(this.a), (gsk) mkoVar.a());
            case 2:
                return new gyv(((lry) this.a).b(), (gnv) this.b.a(), ((gyr) this.c).a());
            case 3:
                hcc hccVar = (hcc) this.c.a();
                jer jerVar = (jer) ((lsi) this.a).b;
                return new hfo(hccVar.b, (hjy) this.b.a(), (hfn) jerVar.e(new hfp()));
            case 4:
                return new hmp((jzd) this.a.a(), (hnu) this.b.a(), this.c);
            case 5:
                return new hnq((hnu) this.c.a(), (hny) this.a.a(), this.b);
            case 6:
                Object obj = ((lsi) this.c).b;
                final ktn a = ((hns) this.a).a();
                final jer jerVar2 = (jer) obj;
                final mko mkoVar2 = this.b;
                return new hzn() { // from class: hpi
                    @Override // defpackage.hzn
                    public final void a() {
                        if (((Boolean) jer.this.e(false)).booleanValue() && hzc.b()) {
                            Iterator it = ((lsp) mkoVar2).a().iterator();
                            while (it.hasNext()) {
                                ((hpg) it.next()).Y();
                            }
                            a.g();
                        }
                    }
                };
            case 7:
                return new hqr(lsg.c(this.a), (jer) ((lsi) this.b).b, (Executor) this.c.a());
            case 8:
                return new hqk(null);
            case 9:
                jer jerVar3 = (jer) ((lsi) this.b).b;
                jer jerVar4 = (jer) ((lsi) this.a).b;
                if (!jerVar3.g() && !jerVar4.g()) {
                    jmsVar = jmo.a;
                } else {
                    jmsVar = new jms((hpg) this.c.a());
                }
                jmsVar.getClass();
                return jmsVar;
            case 10:
                Random random = (Random) this.b.a();
                htl htlVar = (htl) this.c.a();
                return new hty(random, htlVar);
            case 11:
                return new bqm(((lry) this.c).b(), (jer) ((lsi) this.a).b, ((hum) this.b).a(), new ClearcutMetricSnapshotTransmitter());
            case 12:
                final kuv a2 = ((hze) this.c).a();
                final Map map = ((lse) this.b).a;
                final Map map2 = ((lse) this.a).a;
                return new hzg() { // from class: hzo
                    @Override // defpackage.hzg
                    public final void a() {
                        jax c = jbu.c("Startup Listeners");
                        try {
                            boolean A = kuv.this.A();
                            Map map3 = map;
                            if (A) {
                                double random2 = Math.random();
                                Map map4 = map2;
                                if (random2 < 0.5d) {
                                    hrc.a(map3);
                                    hrc.a(map4);
                                } else {
                                    hrc.a(map4);
                                    hrc.a(map3);
                                }
                            } else {
                                hrc.a(map3);
                            }
                            c.close();
                        } catch (Throwable th) {
                            try {
                                c.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                };
            case 13:
                return new ibf(bym.A(), (nca) this.b.a(), (jzd) this.a.a(), ((ifb) this.c).a());
            case 14:
                return new nca(((lry) this.a).b(), bym.A(), (jzd) this.b.a(), (fma) this.c.a());
            case 15:
                mko mkoVar3 = this.a;
                return new kpb(this.b, this.c, mkoVar3);
            case 16:
                return new igh((ici) this.a.a(), ((ifb) this.c).a(), (jzd) this.b.a());
            case 17:
                return new ihu((lja) this.a.a(), ((enp) this.b).a(), (jzc) this.c.a());
            default:
                mko mkoVar4 = this.a;
                Object a3 = this.b.a();
                return new kuv((iym) a3, ((lry) this.c).b());
        }
    }

    public gwa(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.b = mkoVar3;
    }

    public gwa(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, float[] fArr) {
        this.d = i;
        this.b = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
    }

    public gwa(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
    }

    public gwa(mko mkoVar, mko mkoVar2, mko mkoVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = mkoVar;
        this.c = mkoVar2;
        this.b = mkoVar3;
    }
}
