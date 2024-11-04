package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iny {
    public final inx a;
    public final inx b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    final int k;
    public int l;

    public iny(Context context, inx inxVar) {
        AttributeSet attributeSet;
        int i;
        int i2;
        boolean z;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        Locale.Category category;
        inx inxVar2 = new inx();
        this.b = inxVar2;
        int i3 = inxVar.a;
        if (i3 != 0) {
            AttributeSet g = iqh.g(context, i3);
            i = g.getStyleAttribute();
            attributeSet = g;
        } else {
            attributeSet = null;
            i = 0;
        }
        if (i == 0) {
            i2 = R.style.Widget_MaterialComponents_Badge;
        } else {
            i2 = i;
        }
        TypedArray a = isa.a(context, attributeSet, inz.a, R.attr.badgeStyle, i2, new int[0]);
        Resources resources = context.getResources();
        this.c = a.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = a.getDimensionPixelSize(15, -1);
        this.e = a.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = a.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = a.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = a.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = a.getInt(25, 1);
        this.l = a.getInt(2, 0);
        int i4 = inxVar.i;
        inxVar2.i = i4 == -2 ? 255 : i4;
        int i5 = inxVar.k;
        if (i5 != -2) {
            inxVar2.k = i5;
        } else if (a.hasValue(24)) {
            inxVar2.k = a.getInt(24, 0);
        } else {
            inxVar2.k = -1;
        }
        String str = inxVar.j;
        if (str != null) {
            inxVar2.j = str;
        } else if (a.hasValue(8)) {
            inxVar2.j = a.getString(8);
        }
        inxVar2.o = inxVar.o;
        CharSequence charSequence = inxVar.p;
        inxVar2.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i6 = inxVar.q;
        inxVar2.q = i6 == 0 ? R.plurals.mtrl_badge_content_description : i6;
        int i7 = inxVar.r;
        inxVar2.r = i7 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = inxVar.t;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        inxVar2.t = Boolean.valueOf(z);
        int i8 = inxVar.l;
        inxVar2.l = i8 == -2 ? a.getInt(22, -2) : i8;
        int i9 = inxVar.m;
        inxVar2.m = i9 == -2 ? a.getInt(23, -2) : i9;
        Integer num = inxVar.e;
        if (num == null) {
            intValue = a.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        inxVar2.e = Integer.valueOf(intValue);
        Integer num2 = inxVar.f;
        if (num2 == null) {
            intValue2 = a.getResourceId(7, 0);
        } else {
            intValue2 = num2.intValue();
        }
        inxVar2.f = Integer.valueOf(intValue2);
        Integer num3 = inxVar.g;
        if (num3 == null) {
            intValue3 = a.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        inxVar2.g = Integer.valueOf(intValue3);
        Integer num4 = inxVar.h;
        if (num4 == null) {
            intValue4 = a.getResourceId(17, 0);
        } else {
            intValue4 = num4.intValue();
        }
        inxVar2.h = Integer.valueOf(intValue4);
        Integer num5 = inxVar.b;
        if (num5 == null) {
            intValue5 = k(context, a, 1);
        } else {
            intValue5 = num5.intValue();
        }
        inxVar2.b = Integer.valueOf(intValue5);
        Integer num6 = inxVar.d;
        if (num6 == null) {
            intValue6 = a.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        inxVar2.d = Integer.valueOf(intValue6);
        Integer num7 = inxVar.c;
        if (num7 != null) {
            inxVar2.c = num7;
        } else if (a.hasValue(10)) {
            inxVar2.c = Integer.valueOf(k(context, a, 10));
        } else {
            inxVar2.c = Integer.valueOf(new ius(context, inxVar2.d.intValue()).j.getDefaultColor());
        }
        Integer num8 = inxVar.s;
        if (num8 == null) {
            intValue7 = a.getInt(3, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        inxVar2.s = Integer.valueOf(intValue7);
        Integer num9 = inxVar.u;
        if (num9 == null) {
            intValue8 = a.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        inxVar2.u = Integer.valueOf(intValue8);
        Integer num10 = inxVar.v;
        if (num10 == null) {
            intValue9 = a.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        inxVar2.v = Integer.valueOf(intValue9);
        Integer num11 = inxVar.w;
        if (num11 == null) {
            intValue10 = a.getDimensionPixelOffset(19, 0);
        } else {
            intValue10 = num11.intValue();
        }
        inxVar2.w = Integer.valueOf(intValue10);
        Integer num12 = inxVar.x;
        if (num12 == null) {
            intValue11 = a.getDimensionPixelOffset(26, 0);
        } else {
            intValue11 = num12.intValue();
        }
        inxVar2.x = Integer.valueOf(intValue11);
        Integer num13 = inxVar.y;
        if (num13 == null) {
            intValue12 = a.getDimensionPixelOffset(20, inxVar2.w.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        inxVar2.y = Integer.valueOf(intValue12);
        Integer num14 = inxVar.z;
        if (num14 == null) {
            intValue13 = a.getDimensionPixelOffset(27, inxVar2.x.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        inxVar2.z = Integer.valueOf(intValue13);
        Integer num15 = inxVar.C;
        if (num15 == null) {
            intValue14 = a.getDimensionPixelOffset(21, 0);
        } else {
            intValue14 = num15.intValue();
        }
        inxVar2.C = Integer.valueOf(intValue14);
        Integer num16 = inxVar.A;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        inxVar2.A = Integer.valueOf(intValue15);
        Integer num17 = inxVar.B;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        inxVar2.B = Integer.valueOf(intValue16);
        Boolean bool2 = inxVar.D;
        if (bool2 == null) {
            booleanValue = a.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        inxVar2.D = Boolean.valueOf(booleanValue);
        a.recycle();
        Locale locale2 = inxVar.n;
        if (locale2 == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            inxVar2.n = locale;
        } else {
            inxVar2.n = locale2;
        }
        this.a = inxVar;
    }

    private static int k(Context context, TypedArray typedArray, int i) {
        return hzc.i(context, typedArray, i).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.s.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.b.f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.b.e.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        return this.b.h.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.b.g.intValue();
    }

    public final int f() {
        return this.b.q;
    }

    public final int g() {
        return this.b.w.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale h() {
        return this.b.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        if (this.b.k != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        if (this.b.j != null) {
            return true;
        }
        return false;
    }
}
