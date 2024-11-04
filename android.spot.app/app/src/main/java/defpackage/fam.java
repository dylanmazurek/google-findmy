package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fam implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fam famVar = (fam) obj;
        int i = this.b;
        int i2 = famVar.b;
        if (i != i2) {
            return i - i2;
        }
        return this.a - famVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + "}";
    }
}
