package androidx.compose.ui.graphics;

import defpackage.a;
import defpackage.amr;
import defpackage.aow;
import defpackage.aqx;
import defpackage.arj;
import defpackage.arm;
import defpackage.arn;
import defpackage.aro;
import defpackage.azf;
import defpackage.azq;
import defpackage.qg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends azf {
    private final float a;
    private final float b;
    private final float c;
    private final float k;
    private final long l;
    private final arm m;
    private final boolean n;
    private final long p;
    private final long q;
    private final float e = 0.0f;
    private final float f = 0.0f;
    private final float g = 0.0f;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final float j = 0.0f;
    private final arj o = null;
    private final int r = 0;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, long j, arm armVar, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.k = f4;
        this.l = j;
        this.m = armVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new arn(this.a, this.b, this.c, this.k, this.l, this.m, this.n, this.p, this.q);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        arn arnVar = (arn) aowVar;
        arnVar.a = this.a;
        arnVar.b = this.b;
        arnVar.c = this.c;
        arnVar.d = this.k;
        arnVar.e = this.l;
        arnVar.f = this.m;
        arnVar.g = this.n;
        arnVar.h = this.p;
        arnVar.i = this.q;
        azq azqVar = qg.g(arnVar, 2).t;
        if (azqVar != null) {
            azqVar.al(arnVar.j, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0) {
            return false;
        }
        float f = graphicsLayerElement.e;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.f;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f3 = graphicsLayerElement.g;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f4 = graphicsLayerElement.h;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f5 = graphicsLayerElement.i;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f6 = graphicsLayerElement.j;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0 || !a.n(this.l, graphicsLayerElement.l) || !amr.i(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        arj arjVar = graphicsLayerElement.o;
        if (!amr.i(null, null) || !a.n(this.p, graphicsLayerElement.p) || !a.n(this.q, graphicsLayerElement.q)) {
            return false;
        }
        int i = graphicsLayerElement.r;
        if (a.m(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.k)) * 31) + a.l(this.l)) * 31) + this.m.hashCode()) * 31) + a.i(this.n)) * 961) + a.l(this.p)) * 31) + a.l(this.q)) * 31;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.k + ", transformOrigin=" + ((Object) aro.c(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) aqx.g(this.p)) + ", spotShadowColor=" + ((Object) aqx.g(this.q)) + ", compositingStrategy=CompositingStrategy(value=0))";
    }
}
