package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwg implements gwf {
    public final String a;

    public gwg(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.gwf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.gwf
    public final /* synthetic */ boolean b() {
        return frx.aD(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gwg) && amr.i(this.a, ((gwg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DelegatedGaia(obfuscatedGaiaId=" + this.a + ")";
    }
}
