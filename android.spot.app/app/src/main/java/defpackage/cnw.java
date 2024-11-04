package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnw extends Drawable.ConstantState {
    int a;
    cnv b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public cnw() {
        this.c = null;
        this.d = cny.a;
        this.b = new cnv();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        cnv cnvVar = this.b;
        cnvVar.a(cnvVar.d, cnv.a, canvas, i, i2);
    }

    public final boolean b() {
        cnv cnvVar = this.b;
        if (cnvVar.k == null) {
            cnvVar.k = Boolean.valueOf(cnvVar.d.b());
        }
        return cnvVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new cny(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new cny(this);
    }

    public cnw(cnw cnwVar) {
        this.c = null;
        this.d = cny.a;
        if (cnwVar != null) {
            this.a = cnwVar.a;
            this.b = new cnv(cnwVar.b);
            Paint paint = cnwVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = cnwVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = cnwVar.c;
            this.d = cnwVar.d;
            this.e = cnwVar.e;
        }
    }
}
