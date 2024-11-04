package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aqa implements mpa {
    public final /* synthetic */ moh a;

    public aqa(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.mpa
    public final mkq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aqa) && (obj instanceof mpa)) {
            return amr.i(this.a, ((mpa) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
