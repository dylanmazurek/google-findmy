package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtn implements mtz {
    public final boolean a;

    public mtn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mtz
    public final mus a() {
        return null;
    }

    @Override // defpackage.mtz
    public final boolean dd() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (true != this.a) {
            str = "New";
        } else {
            str = "Active";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
