package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements f {
    private final j$.time.temporal.a a;
    private final v b;
    private final b c;
    private volatile i d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j$.time.temporal.a aVar, v vVar, b bVar) {
        this.a = aVar;
        this.b = vVar;
        this.c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        String a;
        Long e = pVar.e(this.a);
        if (e == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) pVar.d().B(j$.time.temporal.k.e());
        if (nVar != null && nVar != j$.time.chrono.u.d) {
            b bVar = this.c;
            long longValue = e.longValue();
            v vVar = this.b;
            pVar.c();
            a = bVar.a.a(longValue, vVar);
        } else {
            b bVar2 = this.c;
            long longValue2 = e.longValue();
            v vVar2 = this.b;
            pVar.c();
            a = bVar2.a.a(longValue2, vVar2);
        }
        if (a == null) {
            if (this.d == null) {
                this.d = new i(this.a, 1, 19, u.NORMAL);
            }
            return this.d.k(pVar, sb);
        }
        sb.append(a);
        return true;
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.a aVar = this.a;
        v vVar2 = this.b;
        if (vVar2 == vVar) {
            return "Text(" + String.valueOf(aVar) + ")";
        }
        return "Text(" + String.valueOf(aVar) + "," + String.valueOf(vVar2) + ")";
    }
}
