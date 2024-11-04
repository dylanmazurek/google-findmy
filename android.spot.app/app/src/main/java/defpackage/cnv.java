package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnv {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final cnt d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final rx l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public cnv() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new rx();
        this.d = new cnt();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(cnt cntVar, Matrix matrix, Canvas canvas, int i, int i2) {
        float f;
        Path.FillType fillType;
        Path.FillType fillType2;
        cntVar.a.set(matrix);
        cntVar.a.preConcat(cntVar.j);
        canvas.save();
        for (int i3 = 0; i3 < cntVar.b.size(); i3++) {
            cdn cdnVar = (cdn) cntVar.b.get(i3);
            if (cdnVar instanceof cnt) {
                a((cnt) cdnVar, cntVar.a, canvas, i, i2);
            } else if (cdnVar instanceof cnu) {
                cnu cnuVar = (cnu) cdnVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                float min = Math.min(f2, f3);
                Matrix matrix2 = cntVar.a;
                this.o.set(matrix2);
                this.o.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[0], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    f = Math.abs(f7 - f8) / max;
                } else {
                    f = 0.0f;
                }
                if (f != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    brr[] brrVarArr = cnuVar.m;
                    if (brrVarArr != null) {
                        bpn.d(brrVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (cnuVar.d()) {
                        Path path3 = this.n;
                        if (cnuVar.o == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path3.setFillType(fillType2);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        cns cnsVar = (cns) cnuVar;
                        float f9 = cnsVar.e;
                        if (f9 != 0.0f || cnsVar.f != 1.0f) {
                            float f10 = cnsVar.g;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (cnsVar.f + f10) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path2.reset();
                            if (f13 > f14) {
                                this.p.getSegment(f13, length, path2, true);
                                this.p.getSegment(0.0f, f14, path2, true);
                            } else {
                                this.p.getSegment(f13, f14, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (cnsVar.l.e()) {
                            kvu kvuVar = cnsVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (kvuVar.b()) {
                                Shader shader = (Shader) kvuVar.c;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(cnsVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(cny.a(kvuVar.b, cnsVar.d));
                            }
                            paint2.setColorFilter(null);
                            Path path4 = this.n;
                            if (cnsVar.o == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path4.setFillType(fillType);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (cnsVar.k.e()) {
                            kvu kvuVar2 = cnsVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = cnsVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = cnsVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(cnsVar.j);
                            if (kvuVar2.b()) {
                                Shader shader2 = (Shader) kvuVar2.c;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(cnsVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(cny.a(kvuVar2.b, cnsVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(cnsVar.b * f * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public cnv(cnv cnvVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        rx rxVar = new rx();
        this.l = rxVar;
        this.d = new cnt(cnvVar.d, rxVar);
        this.m = new Path(cnvVar.m);
        this.n = new Path(cnvVar.n);
        this.e = cnvVar.e;
        this.f = cnvVar.f;
        this.g = cnvVar.g;
        this.h = cnvVar.h;
        int i = cnvVar.q;
        this.q = 0;
        this.i = cnvVar.i;
        this.j = cnvVar.j;
        String str = cnvVar.j;
        if (str != null) {
            rxVar.put(str, this);
        }
        this.k = cnvVar.k;
    }
}
