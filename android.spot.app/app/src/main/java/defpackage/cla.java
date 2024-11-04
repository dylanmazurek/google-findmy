package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cla {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    public float g;
    float h;
    int[] i;
    float j;
    float k;
    float l;
    boolean m;
    Path n;
    float o;
    public float p;
    public int q;
    public int r;
    int s;
    int t;

    public cla() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.o = 1.0f;
        this.s = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.i[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    public final void d(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        int length = this.i.length;
    }

    public final void g() {
        this.t = this.i[0];
    }
}
