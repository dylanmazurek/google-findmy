package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jew extends jdm {
    final /* synthetic */ jey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jew(jey jeyVar, kru kruVar, CharSequence charSequence) {
        super(kruVar, charSequence);
        this.f = jeyVar;
    }

    @Override // defpackage.jdm
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.jdm
    public final int b(int i) {
        return ((jeb) this.f.a).i(this.b, i);
    }
}
