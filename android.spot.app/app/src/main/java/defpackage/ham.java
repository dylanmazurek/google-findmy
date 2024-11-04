package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ham {
    public final jer a;
    public final frx b;

    public ham(jer jerVar, frx frxVar) {
        jerVar.getClass();
        this.a = jerVar;
        this.b = frxVar;
    }

    public static final lyn a() {
        lyn lynVar = new lyn(null, null, null, null);
        lynVar.a = new frx();
        return lynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ham)) {
            return false;
        }
        ham hamVar = (ham) obj;
        if (amr.i(this.a, hamVar.a) && amr.i(this.b, hamVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ")";
    }
}
