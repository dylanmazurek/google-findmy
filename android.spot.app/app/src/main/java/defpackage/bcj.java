package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcj extends mpe implements mnw {
    final /* synthetic */ boolean a;
    final /* synthetic */ cjy b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcj(boolean z, cjy cjyVar, String str) {
        super(0);
        this.a = z;
        this.b = cjyVar;
        this.c = str;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.a) {
            cjy cjyVar = this.b;
            cjyVar.a.b(this.c);
        }
        return mlh.a;
    }
}
