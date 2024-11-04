package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cyy implements czr, czh, czb {
    protected final dcu a;
    final Paint b;
    float c;
    private final cym h;
    private final float[] j;
    private final czw k;
    private final czw l;
    private final List m;
    private final czw n;
    private czw o;
    private czw p;
    private czz q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public cyy(cym cymVar, dcu dcuVar, Paint.Cap cap, Paint.Join join, float f, dbu dbuVar, dbs dbsVar, List list, dbs dbsVar2) {
        cyx cyxVar = new cyx(1);
        this.b = cyxVar;
        this.c = 0.0f;
        this.h = cymVar;
        this.a = dcuVar;
        cyxVar.setStyle(Paint.Style.STROKE);
        cyxVar.setStrokeCap(cap);
        cyxVar.setStrokeJoin(join);
        cyxVar.setStrokeMiter(f);
        this.l = dbuVar.a();
        this.k = dbsVar.a();
        if (dbsVar2 == null) {
            this.n = null;
        } else {
            this.n = dbsVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((dbs) list.get(i)).a());
        }
        dcuVar.i(this.l);
        dcuVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            dcuVar.i((czw) this.m.get(i2));
        }
        czw czwVar = this.n;
        if (czwVar != null) {
            dcuVar.i(czwVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((czw) this.m.get(i3)).h(this);
        }
        czw czwVar2 = this.n;
        if (czwVar2 != null) {
            czwVar2.h(this);
        }
        if (dcuVar.q() != null) {
            czw a = ((dbs) dcuVar.q().a).a();
            this.p = a;
            a.h(this);
            dcuVar.i(this.p);
        }
        if (dcuVar.r() != null) {
            this.q = new czz(this, dcuVar, dcuVar.r());
        }
    }

    @Override // defpackage.dbn
    public void a(Object obj, dfe dfeVar) {
        czz czzVar;
        czz czzVar2;
        czz czzVar3;
        czz czzVar4;
        czz czzVar5;
        if (obj == cyq.d) {
            this.l.k(dfeVar);
            return;
        }
        if (obj == cyq.s) {
            this.k.k(dfeVar);
            return;
        }
        if (obj == cyq.K) {
            czw czwVar = this.o;
            if (czwVar != null) {
                this.a.k(czwVar);
            }
            if (dfeVar == null) {
                this.o = null;
                return;
            }
            dan danVar = new dan(dfeVar);
            this.o = danVar;
            danVar.h(this);
            this.a.i(this.o);
            return;
        }
        if (obj == cyq.j) {
            czw czwVar2 = this.p;
            if (czwVar2 != null) {
                czwVar2.k(dfeVar);
                return;
            }
            dan danVar2 = new dan(dfeVar);
            this.p = danVar2;
            danVar2.h(this);
            this.a.i(this.p);
            return;
        }
        if (obj == cyq.e && (czzVar5 = this.q) != null) {
            czzVar5.b(dfeVar);
            return;
        }
        if (obj == cyq.G && (czzVar4 = this.q) != null) {
            czzVar4.f(dfeVar);
            return;
        }
        if (obj == cyq.H && (czzVar3 = this.q) != null) {
            czzVar3.c(dfeVar);
            return;
        }
        if (obj == cyq.I && (czzVar2 = this.q) != null) {
            czzVar2.e(dfeVar);
        } else if (obj == cyq.J && (czzVar = this.q) != null) {
            czzVar.g(dfeVar);
        }
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.czb
    public void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue;
        float f;
        float f2;
        float f3;
        float[] fArr = (float[]) dfb.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            dac dacVar = (dac) this.l;
            this.b.setAlpha(dew.e((int) ((((i / 255.0f) * dacVar.l(dacVar.d(), dacVar.b())) / 100.0f) * 255.0f)));
            this.b.setStrokeWidth(((daa) this.k).l() * dfb.b(matrix));
            if (this.b.getStrokeWidth() > 0.0f) {
                if (this.m.isEmpty()) {
                    cxw.a();
                } else {
                    float b = dfb.b(matrix);
                    for (int i2 = 0; i2 < this.m.size(); i2++) {
                        this.j[i2] = ((Float) ((czw) this.m.get(i2)).e()).floatValue();
                        if (i2 % 2 == 0) {
                            float[] fArr2 = this.j;
                            if (fArr2[i2] < 1.0f) {
                                fArr2[i2] = 1.0f;
                            }
                        } else {
                            float[] fArr3 = this.j;
                            if (fArr3[i2] < 0.1f) {
                                fArr3[i2] = 0.1f;
                            }
                        }
                        float[] fArr4 = this.j;
                        fArr4[i2] = fArr4[i2] * b;
                    }
                    czw czwVar = this.n;
                    if (czwVar == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) czwVar.e()).floatValue() * b;
                    }
                    this.b.setPathEffect(new DashPathEffect(this.j, floatValue));
                    cxw.a();
                }
                czw czwVar2 = this.o;
                if (czwVar2 != null) {
                    this.b.setColorFilter((ColorFilter) czwVar2.e());
                }
                czw czwVar3 = this.p;
                if (czwVar3 != null) {
                    float floatValue2 = ((Float) czwVar3.e()).floatValue();
                    if (floatValue2 == 0.0f) {
                        this.b.setMaskFilter(null);
                    } else if (floatValue2 != this.c) {
                        this.b.setMaskFilter(this.a.h(floatValue2));
                    }
                    this.c = floatValue2;
                }
                czz czzVar = this.q;
                if (czzVar != null) {
                    czzVar.a(this.b);
                }
                int i3 = 0;
                while (i3 < this.i.size()) {
                    elo eloVar = (elo) this.i.get(i3);
                    if (eloVar.b != null) {
                        this.e.reset();
                        int size = eloVar.a.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else {
                                this.e.addPath(((czj) eloVar.a.get(size)).i(), matrix);
                            }
                        }
                        float floatValue3 = ((Float) ((czq) eloVar.b).b.e()).floatValue() / 100.0f;
                        float floatValue4 = ((Float) ((czq) eloVar.b).c.e()).floatValue() / 100.0f;
                        float floatValue5 = ((Float) ((czq) eloVar.b).d.e()).floatValue() / 360.0f;
                        if (floatValue3 < 0.01f && floatValue4 > 0.99f) {
                            canvas.drawPath(this.e, this.b);
                            cxw.a();
                        } else {
                            this.d.setPath(this.e, z);
                            float length = this.d.getLength();
                            while (this.d.nextContour()) {
                                length += this.d.getLength();
                            }
                            float f4 = floatValue5 * length;
                            float f5 = (floatValue3 * length) + f4;
                            float min = Math.min((floatValue4 * length) + f4, (f5 + length) - 1.0f);
                            int size2 = eloVar.a.size() - 1;
                            float f6 = 0.0f;
                            while (size2 >= 0) {
                                this.f.set(((czj) eloVar.a.get(size2)).i());
                                this.f.transform(matrix);
                                this.d.setPath(this.f, z);
                                float length2 = this.d.getLength();
                                float f7 = f6 + length2;
                                if (min > length) {
                                    float f8 = min - length;
                                    if (f8 < f7 && f6 < f8) {
                                        if (f5 > length) {
                                            f3 = (f5 - length) / length2;
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        dfb.d(this.f, f3, Math.min(f8 / length2, 1.0f), 0.0f);
                                        canvas.drawPath(this.f, this.b);
                                        size2--;
                                        f6 = f7;
                                        z = false;
                                    }
                                }
                                if (f7 >= f5 && f6 <= min) {
                                    if (f7 <= min && f5 < f6) {
                                        canvas.drawPath(this.f, this.b);
                                    } else {
                                        if (f5 < f6) {
                                            f = 0.0f;
                                        } else {
                                            f = (f5 - f6) / length2;
                                        }
                                        if (min > f7) {
                                            f2 = 1.0f;
                                        } else {
                                            f2 = (min - f6) / length2;
                                        }
                                        dfb.d(this.f, f, f2, 0.0f);
                                        canvas.drawPath(this.f, this.b);
                                    }
                                }
                                size2--;
                                f6 = f7;
                                z = false;
                            }
                            cxw.a();
                        }
                    } else {
                        this.e.reset();
                        int size3 = eloVar.a.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            } else {
                                this.e.addPath(((czj) eloVar.a.get(size3)).i(), matrix);
                            }
                        }
                        cxw.a();
                        canvas.drawPath(this.e, this.b);
                        cxw.a();
                    }
                    i3++;
                    z = false;
                }
                cxw.a();
                return;
            }
            cxw.a();
            return;
        }
        cxw.a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.e.reset();
        for (int i = 0; i < this.i.size(); i++) {
            elo eloVar = (elo) this.i.get(i);
            for (int i2 = 0; i2 < eloVar.a.size(); i2++) {
                this.e.addPath(((czj) eloVar.a.get(i2)).i(), matrix);
            }
        }
        this.e.computeBounds(this.g, false);
        czw czwVar = this.k;
        RectF rectF2 = this.g;
        float l = ((daa) czwVar).l() / 2.0f;
        rectF2.set(rectF2.left - l, this.g.top - l, this.g.right + l, this.g.bottom + l);
        rectF.set(this.g);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        cxw.a();
    }

    @Override // defpackage.czr
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dew.d(dbmVar, i, list, dbmVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        elo eloVar = null;
        czq czqVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            cyz cyzVar = (cyz) list.get(size);
            if (cyzVar instanceof czq) {
                czq czqVar2 = (czq) cyzVar;
                if (czqVar2.e == 2) {
                    czqVar = czqVar2;
                }
            }
        }
        if (czqVar != null) {
            czqVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            cyz cyzVar2 = (cyz) list2.get(size2);
            if (cyzVar2 instanceof czq) {
                czq czqVar3 = (czq) cyzVar2;
                if (czqVar3.e == 2) {
                    if (eloVar != null) {
                        this.i.add(eloVar);
                    }
                    elo eloVar2 = new elo(czqVar3);
                    czqVar3.a(this);
                    eloVar = eloVar2;
                }
            }
            if (cyzVar2 instanceof czj) {
                if (eloVar == null) {
                    eloVar = new elo(czqVar);
                }
                eloVar.a.add((czj) cyzVar2);
            }
        }
        if (eloVar != null) {
            this.i.add(eloVar);
        }
    }
}
