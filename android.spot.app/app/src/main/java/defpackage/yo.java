package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yo extends mpe implements mol {
    final /* synthetic */ String a;
    final /* synthetic */ aox b;
    final /* synthetic */ bgm c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(String str, aox aoxVar, bgm bgmVar, int i, boolean z, int i2, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = aoxVar;
        this.c = bgmVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ct.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (abi) obj, aev.a(this.h | 1));
        return mlh.a;
    }
}
