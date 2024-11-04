package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama implements amm, afq {
    public amh a;
    public amc b;
    public String c;
    public Object d;
    public Object[] e;
    public amb f;
    private final mnw g = new alz(this);

    public ama(amh amhVar, amc amcVar, String str, Object obj, Object[] objArr) {
        this.a = amhVar;
        this.b = amcVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.afq
    public final void c() {
        d();
    }

    public final void d() {
        String a;
        amc amcVar = this.b;
        if (this.f == null) {
            if (amcVar != null) {
                Object a2 = this.g.a();
                if (a2 != null && !amcVar.c(a2)) {
                    if (a2 instanceof ann) {
                        ann annVar = (ann) a2;
                        if (annVar.i() != adu.a && annVar.i() != agw.a && annVar.i() != afo.a) {
                            a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            a = "MutableState containing " + annVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        a = aly.a(a2);
                    }
                    throw new IllegalArgumentException(a);
                }
                this.f = amcVar.a(this.c, this.g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("entry(" + this.f + ") is not null");
    }

    @Override // defpackage.afq
    public final void h() {
        amb ambVar = this.f;
        if (ambVar != null) {
            ambVar.a();
        }
    }

    @Override // defpackage.afq
    public final void i() {
        amb ambVar = this.f;
        if (ambVar != null) {
            ambVar.a();
        }
    }
}
