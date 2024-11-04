package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bav extends mpe implements moh {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bav(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        Boolean f = ij.f((aqh) obj, this.a);
        if (f != null) {
            z = f.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
