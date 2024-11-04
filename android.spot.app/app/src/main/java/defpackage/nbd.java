package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbd {
    public final naz a;
    public naz b;
    final /* synthetic */ mun c;
    final /* synthetic */ Object d;
    private final mrr e;

    public nbd() {
        throw null;
    }

    public final Object a(Object obj) {
        boolean z;
        naz nazVar;
        Object obj2 = this.e.a;
        if (obj2 == nad.a) {
            mun munVar = this.c;
            if (munVar.B() == this.d) {
                obj2 = null;
            } else {
                obj2 = nax.a;
            }
            boolean z2 = msy.a;
            Object obj3 = this.e.a;
            Object obj4 = nad.a;
            if (obj3 != obj4) {
                obj2 = obj3;
            } else if (!this.e.d(obj4, obj2)) {
                obj2 = this.e.a;
            }
        }
        naz nazVar2 = (naz) obj;
        if (obj2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nazVar = this.a;
        } else {
            nazVar = this.b;
        }
        if (nazVar != null && nazVar2.e.d(this, nazVar) && z) {
            naz nazVar3 = this.a;
            naz nazVar4 = this.b;
            nazVar4.getClass();
            nazVar3.i(nazVar4);
        }
        return obj2;
    }

    public final String toString() {
        return msz.a(this) + "@" + msz.b(this);
    }

    public nbd(naz nazVar, mun munVar, Object obj) {
        this.c = munVar;
        this.d = obj;
        this.e = new mrr(nad.a, mrs.a);
        this.a = nazVar;
    }
}
