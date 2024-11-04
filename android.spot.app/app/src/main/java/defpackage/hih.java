package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hih implements hbd {
    public String a;
    private final hbc b;

    public hih(hbc hbcVar) {
        this.b = hbcVar;
    }

    @Override // defpackage.hbd
    public final void g(jis jisVar) {
        Object obj;
        this.b.g(jisVar);
        if (!jisVar.isEmpty() && this.b.a() == null) {
            String str = this.a;
            if (str != null) {
                int size = jisVar.size();
                int i = 0;
                while (i < size) {
                    obj = jisVar.get(i);
                    i++;
                    if (str.equals(frx.aj(obj))) {
                        break;
                    }
                }
            }
            obj = null;
            if (obj == null || !jisVar.contains(obj)) {
                obj = jisVar.get(0);
            }
            obj.getClass();
            this.b.h(obj);
        }
        if (!jisVar.isEmpty()) {
            this.a = null;
        }
    }
}
