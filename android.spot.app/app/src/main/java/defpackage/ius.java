package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ius {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public Typeface l;
    private final int m;
    private boolean n = false;
    private boolean o = false;

    public ius(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iup.b);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = hzc.i(context, obtainStyledAttributes, 3);
        hzc.i(context, obtainStyledAttributes, 4);
        hzc.i(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = true != obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = hzc.i(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, iup.a);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        if (this.l == null && (str = this.b) != null) {
            this.l = Typeface.create(str, this.c);
        }
        if (this.l == null) {
            int i = this.d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.l = Typeface.DEFAULT;
                        this.l = Typeface.create(this.l, this.c);
                    }
                    typeface = Typeface.MONOSPACE;
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            this.l = typeface;
            this.l = Typeface.create(this.l, this.c);
        }
    }

    private final boolean h(Context context) {
        Typeface a;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = brm.a;
        Typeface typeface = null;
        if (context.isRestricted()) {
            a = null;
        } else {
            a = brm.a(context, i, new TypedValue(), 0, null, false, true);
        }
        if (a == null) {
            if (!this.o) {
                this.o = true;
                int i2 = this.m;
                Resources resources = context.getResources();
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), bow.b);
                                str = obtainAttributes.getString(6);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.c);
                }
            }
            if (typeface == null) {
                return false;
            }
            a = typeface;
        }
        this.l = a;
        this.n = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.l;
    }

    public final void b(Context context, iut iutVar) {
        int i;
        if (!h(context)) {
            g();
        }
        int i2 = this.m;
        if (i2 == 0) {
            this.n = true;
            i = 0;
        } else {
            i = i2;
        }
        if (!this.n) {
            try {
                iuq iuqVar = new iuq(this, iutVar);
                ThreadLocal threadLocal = brm.a;
                if (context.isRestricted()) {
                    iuqVar.c(-4);
                    return;
                } else {
                    brm.a(context, i, new TypedValue(), 0, iuqVar, false, false);
                    return;
                }
            } catch (Resources.NotFoundException unused) {
                this.n = true;
                iutVar.a(1);
                return;
            } catch (Exception unused2) {
                this.n = true;
                iutVar.a(-3);
                return;
            }
        }
        iutVar.b(this.l, true);
    }

    public final void c(Context context, TextPaint textPaint, iut iutVar) {
        int i;
        int i2;
        d(context, textPaint, iutVar);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, this.j.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.g;
        float f2 = this.e;
        float f3 = this.f;
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, this.a.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public final void d(Context context, TextPaint textPaint, iut iutVar) {
        Typeface typeface;
        if (h(context) && this.n && (typeface = this.l) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new iur(this, context, textPaint, iutVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        float f;
        Typeface e = hzc.e(context.getResources().getConfiguration(), typeface);
        if (e != null) {
            typeface = e;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        boolean z = true;
        if (1 != (i & 1)) {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
