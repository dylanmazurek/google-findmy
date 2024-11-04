package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hsp implements mko {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hsp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mko, defpackage.mkn
    public final Object a() {
        ktu ktuVar;
        switch (this.b) {
            case 0:
                return false;
            case 1:
                euo euoVar = (euo) this.a;
                if (euoVar.b().g()) {
                    return null;
                }
                return null;
            case 2:
                return (htj) this.a.a();
            case 3:
                kub kubVar = (kub) this.a;
                if (((ktz) kubVar.b).b.isEmpty()) {
                    ktuVar = new ktu(jmn.a);
                } else {
                    ktuVar = new ktu((jiy) kubVar.a);
                }
                return jis.q(ktuVar);
            case 4:
                jin jinVar = new jin();
                Iterator it = ((ktn) this.a).b.iterator();
                while (it.hasNext()) {
                    jinVar.h(new kuu((ktf) it.next()));
                }
                return jinVar.g();
            case 5:
                return jis.q(new kvg(this.a, 0));
            case 6:
                return jis.r(new kvg(((ktn) this.a).a, 1), new kwc());
            default:
                return jis.q((jis) this.a.a());
        }
    }
}
