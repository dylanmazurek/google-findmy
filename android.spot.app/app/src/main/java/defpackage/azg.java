package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azg {
    public aow a;
    public int b;
    public aiu c;
    public aiu d;
    public boolean e;
    final /* synthetic */ azh f;

    public azg(azh azhVar, aow aowVar, int i, aiu aiuVar, aiu aiuVar2, boolean z) {
        this.f = azhVar;
        this.a = aowVar;
        this.b = i;
        this.c = aiuVar;
        this.d = aiuVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        aiu aiuVar = this.c;
        int i3 = this.b;
        if (azj.a((aov) aiuVar.a[i + i3], (aov) this.d.a[i3 + i2]) != 0) {
            return true;
        }
        return false;
    }
}
