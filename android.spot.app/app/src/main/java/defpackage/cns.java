package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cns extends cnu {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    kvu k;
    kvu l;

    public cns() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    @Override // defpackage.cdn
    public final boolean b() {
        if (!this.l.c() && !this.k.c()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cdn
    public final boolean c(int[] iArr) {
        return this.k.d(iArr) | this.l.d(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.b;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.b;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.b = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.b = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public cns(cns cnsVar) {
        super(cnsVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = cnsVar.a;
        this.a = null;
        this.k = cnsVar.k;
        this.b = cnsVar.b;
        this.c = cnsVar.c;
        this.l = cnsVar.l;
        this.o = cnsVar.o;
        this.d = cnsVar.d;
        this.e = cnsVar.e;
        this.f = cnsVar.f;
        this.g = cnsVar.g;
        this.h = cnsVar.h;
        this.i = cnsVar.i;
        this.j = cnsVar.j;
    }
}
