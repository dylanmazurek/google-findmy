package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ebd implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ebd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [buc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        float f;
        int i = 0;
        switch (this.b) {
            case 0:
                ebb a = ebc.a();
                a.c(false);
                ebc a2 = a.a();
                ((ebf) this.a).k((ag) obj, a2);
                return;
            case 1:
                bvd bvdVar = (bvd) obj;
                Object obj2 = this.a;
                aj F = ((dvg) obj2).F();
                bvdVar.getClass();
                apc apcVar = F.o;
                apcVar.i(bvdVar);
                cex cexVar = ((ag) obj2).ad;
                bvb bvbVar = (bvb) apcVar.b.remove(bvdVar);
                if (bvbVar != null) {
                    bvbVar.a();
                }
                apcVar.b.put(bvdVar, new bvb(cexVar, new bva(apcVar, bvdVar, i)));
                return;
            case 2:
                ((evq) obj).n((ag) this.a);
                return;
            case 3:
                Object obj3 = this.a;
                eir eirVar = (eir) obj;
                jnk jnkVar = ejg.a;
                eirVar.a = jer.i(obj3);
                kzb kzbVar = (kzb) obj3;
                if ((kzbVar.a & 2) != 0) {
                    lln llnVar = kzbVar.c;
                    if (llnVar == null) {
                        llnVar = lln.c;
                    }
                    eirVar.b = jer.i(Long.valueOf(lmi.b(llnVar)));
                    return;
                }
                eirVar.b = jdl.a;
                return;
            case 4:
                ((eir) obj).d(((Boolean) this.a.getValue()).booleanValue());
                return;
            case 5:
                emj emjVar = new emj(0);
                ((eiu) this.a).c((kyh) obj, emjVar);
                return;
            case 6:
                kzq kzqVar = (kzq) obj;
                boolean z = kzqVar.c;
                Object obj4 = this.a;
                if (!z) {
                    if ((kzqVar.a & 1) != 0) {
                        eoj eojVar = (eoj) obj4;
                        etx d = etx.d(eojVar.e, kzqVar.b);
                        ebf ebfVar = eojVar.as;
                        ebb a3 = ebc.a();
                        a3.b(true);
                        ebfVar.k(d, a3.a());
                        return;
                    }
                    ((eoj) obj4).d(kzqVar.b, true);
                    return;
                }
                ((eoj) obj4).d(kzqVar.b, false);
                return;
            case 7:
                ((ilv) this.a).i((ewk) obj);
                return;
            case 8:
                ((ilv) this.a).m((ewk) obj);
                return;
            case 9:
                lps lpsVar = ((dya) obj).b;
                hpd hpdVar = ((eur) this.a).an;
                lnr lnrVar = lpsVar.b;
                if (lnrVar == null) {
                    lnrVar = lnr.c;
                }
                double d2 = lnrVar.a;
                lnr lnrVar2 = lpsVar.b;
                if (lnrVar2 == null) {
                    lnrVar2 = lnr.c;
                }
                double d3 = lnrVar2.b;
                float f2 = lpsVar.c;
                if (f2 <= 10.0f) {
                    f = 19.0f;
                } else if (f2 <= 80.0f) {
                    f = 17.0f;
                } else if (f2 <= 250.0f) {
                    f = 15.0f;
                } else if (f2 <= 1000.0f) {
                    f = 14.0f;
                } else {
                    f = 13.0f;
                }
                hpdVar.g(new CameraPosition(new LatLng(d2, d3), f, 0.0f, 0.0f));
                return;
            case 10:
                bsc.f((Drawable) this.a, ((Integer) obj).intValue());
                return;
            case 11:
                dhx dhxVar = (dhx) this.a;
                evh evhVar = (evh) obj;
                jer jerVar = (jer) ((cfk) dhxVar.a).d();
                if (jerVar != null && jerVar.f() == evhVar) {
                    ((cfn) dhxVar.a).l(jdl.a);
                    return;
                }
                return;
            case 12:
                gml gmlVar = (gml) this.a;
                lqc lqcVar = (lqc) obj;
                ((ewf) gmlVar.d).d(lqcVar);
                gmlVar.a(lqcVar);
                return;
            default:
                this.a.a((njz) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
