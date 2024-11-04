package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ive extends Drawable.ConstantState {
    public ivl a;
    public final ivl b;
    iqi c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    public Rect j;
    float k;
    public float l;
    float m;
    int n;
    float o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public ive(ive iveVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = iveVar.a;
        this.b = iveVar.b;
        this.c = iveVar.c;
        this.m = iveVar.m;
        this.d = iveVar.d;
        this.e = iveVar.e;
        this.f = iveVar.f;
        this.i = iveVar.i;
        this.h = iveVar.h;
        this.n = iveVar.n;
        this.k = iveVar.k;
        this.t = iveVar.t;
        this.r = iveVar.r;
        boolean z = iveVar.v;
        this.v = false;
        this.l = iveVar.l;
        this.o = iveVar.o;
        this.p = iveVar.p;
        float f = iveVar.q;
        this.q = 0.0f;
        this.s = iveVar.s;
        this.u = iveVar.u;
        ColorStateList colorStateList = iveVar.g;
        this.g = null;
        this.w = iveVar.w;
        Rect rect = iveVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ivf ivfVar = new ivf(this);
        ivfVar.u = true;
        return ivfVar;
    }

    public ive(ivl ivlVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = ivlVar;
        this.c = null;
        this.b = ivf.p;
    }
}
