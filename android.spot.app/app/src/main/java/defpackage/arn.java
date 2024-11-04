package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arn extends aow implements ayj {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public arm f;
    public boolean g;
    public long h;
    public long i;
    public final moh j = new zc(this, 6);

    public arn(float f, float f2, float f3, float f4, long j, arm armVar, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = armVar;
        this.g = z;
        this.h = j2;
        this.i = j3;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        awi cd;
        awr l = awgVar.l(j);
        cd = awjVar.cd(l.a, l.b, mly.a, new tn(l, this, 11, null));
        return cd;
    }

    @Override // defpackage.aow
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.d + ", transformOrigin=" + ((Object) aro.c(this.e)) + ", shape=" + this.f + ", clip=" + this.g + ", renderEffect=null, ambientShadowColor=" + ((Object) aqx.g(this.h)) + ", spotShadowColor=" + ((Object) aqx.g(this.i)) + ", compositingStrategy=CompositingStrategy(value=0))";
    }
}
