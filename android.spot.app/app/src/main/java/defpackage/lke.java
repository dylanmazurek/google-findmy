package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lke {
    protected volatile lkq a;
    public volatile lim b;

    static {
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
    }

    public final lim a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = lim.b;
            } else {
                this.b = this.a.e();
            }
            return this.b;
        }
    }

    public final lkq b(lkq lkqVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = lkqVar;
                        this.b = lim.b;
                    } catch (ljy unused) {
                        this.a = lkqVar;
                        this.b = lim.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lke)) {
            return false;
        }
        lke lkeVar = (lke) obj;
        lkq lkqVar = this.a;
        lkq lkqVar2 = lkeVar.a;
        if (lkqVar == null && lkqVar2 == null) {
            return a().equals(lkeVar.a());
        }
        if (lkqVar != null && lkqVar2 != null) {
            return lkqVar.equals(lkqVar2);
        }
        if (lkqVar != null) {
            return lkqVar.equals(lkeVar.b(lkqVar.s()));
        }
        return b(lkqVar2.s()).equals(lkqVar2);
    }

    public int hashCode() {
        return 1;
    }
}
