package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jel extends jen {
    final /* synthetic */ String a = "";
    final /* synthetic */ jen b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jel(jen jenVar, jen jenVar2) {
        super(jenVar2);
        this.b = jenVar;
    }

    @Override // defpackage.jen
    public final CharSequence a(Object obj) {
        if (obj == null) {
            return this.a;
        }
        return this.b.a(obj);
    }
}
