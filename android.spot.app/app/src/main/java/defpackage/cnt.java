package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnt extends cdn {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public cnt() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    @Override // defpackage.cdn
    public final boolean b() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((cdn) this.b.get(i)).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdn
    public final boolean c(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((cdn) this.b.get(i)).c(iArr);
        }
        return z;
    }

    public final void d() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            d();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            d();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            d();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            d();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            d();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            d();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            d();
        }
    }

    public cnt(cnt cntVar, rx rxVar) {
        cnu cnrVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = cntVar.c;
        this.d = cntVar.d;
        this.e = cntVar.e;
        this.f = cntVar.f;
        this.g = cntVar.g;
        this.h = cntVar.h;
        this.i = cntVar.i;
        int[] iArr = cntVar.l;
        this.l = null;
        String str = cntVar.m;
        this.m = str;
        int i = cntVar.k;
        this.k = 0;
        if (str != null) {
            rxVar.put(str, this);
        }
        matrix.set(cntVar.j);
        ArrayList arrayList = cntVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof cnt) {
                this.b.add(new cnt((cnt) obj, rxVar));
            } else {
                if (obj instanceof cns) {
                    cnrVar = new cns((cns) obj);
                } else if (obj instanceof cnr) {
                    cnrVar = new cnr((cnr) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(cnrVar);
                Object obj2 = cnrVar.n;
                if (obj2 != null) {
                    rxVar.put(obj2, cnrVar);
                }
            }
        }
    }
}
