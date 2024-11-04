package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eai extends eaj {
    private final eam a;

    public eai(eam eamVar) {
        this.a = eamVar;
    }

    @Override // defpackage.ean
    public final int b() {
        return 1;
    }

    @Override // defpackage.eaj, defpackage.ean
    public final eam c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ean) {
            ean eanVar = (ean) obj;
            if (eanVar.b() == 1 && this.a.equals(eanVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectivityInfo{wifi=" + this.a.toString() + "}";
    }
}
