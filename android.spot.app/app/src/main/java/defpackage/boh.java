package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boh {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = bol.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:            if (r9 == (-1)) goto L147;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boh.i(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void j(bnx bnxVar, String str) {
        int i;
        int i2 = -1;
        float f = Float.NaN;
        if (str != null) {
            int indexOf = str.indexOf(44);
            int length = str.length();
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                }
                int i4 = i3;
                i3 = indexOf + 1;
                i = i4;
            } else {
                i = -1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                i2 = i;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                i2 = i;
            }
            i2 = i;
        }
        bnxVar.I = str;
        bnxVar.J = f;
        bnxVar.K = i2;
    }

    private final boc o(int i) {
        HashMap hashMap = this.e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.e.put(valueOf, new boc());
        }
        return (boc) this.e.get(valueOf);
    }

    private static void p(boc bocVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        bob bobVar = new bob();
        bocVar.g = bobVar;
        bocVar.c.b = false;
        bocVar.d.c = false;
        bocVar.b.a = false;
        bocVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (c.get(index)) {
                case 2:
                    bobVar.b(2, typedArray.getDimensionPixelSize(index, bocVar.d.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                case 35:
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", t(index, "Unknown attribute 0x", b));
                    break;
                case 5:
                    bobVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    bobVar.b(6, typedArray.getDimensionPixelOffset(index, bocVar.d.E));
                    break;
                case 7:
                    bobVar.b(7, typedArray.getDimensionPixelOffset(index, bocVar.d.F));
                    break;
                case 8:
                    bobVar.b(8, typedArray.getDimensionPixelSize(index, bocVar.d.L));
                    break;
                case 11:
                    bobVar.b(11, typedArray.getDimensionPixelSize(index, bocVar.d.R));
                    break;
                case 12:
                    bobVar.b(12, typedArray.getDimensionPixelSize(index, bocVar.d.S));
                    break;
                case 13:
                    bobVar.b(13, typedArray.getDimensionPixelSize(index, bocVar.d.O));
                    break;
                case 14:
                    bobVar.b(14, typedArray.getDimensionPixelSize(index, bocVar.d.Q));
                    break;
                case 15:
                    bobVar.b(15, typedArray.getDimensionPixelSize(index, bocVar.d.T));
                    break;
                case 16:
                    bobVar.b(16, typedArray.getDimensionPixelSize(index, bocVar.d.P));
                    break;
                case 17:
                    bobVar.b(17, typedArray.getDimensionPixelOffset(index, bocVar.d.f));
                    break;
                case 18:
                    bobVar.b(18, typedArray.getDimensionPixelOffset(index, bocVar.d.g));
                    break;
                case 19:
                    bobVar.a(19, typedArray.getFloat(index, bocVar.d.h));
                    break;
                case 20:
                    bobVar.a(20, typedArray.getFloat(index, bocVar.d.y));
                    break;
                case 21:
                    bobVar.b(21, typedArray.getLayoutDimension(index, bocVar.d.e));
                    break;
                case 22:
                    bobVar.b(22, a[typedArray.getInt(index, bocVar.b.b)]);
                    break;
                case 23:
                    bobVar.b(23, typedArray.getLayoutDimension(index, bocVar.d.d));
                    break;
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                    bobVar.b(24, typedArray.getDimensionPixelSize(index, bocVar.d.H));
                    break;
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                    bobVar.b(27, typedArray.getInt(index, bocVar.d.G));
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    bobVar.b(28, typedArray.getDimensionPixelSize(index, bocVar.d.I));
                    break;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    bobVar.b(31, typedArray.getDimensionPixelSize(index, bocVar.d.M));
                    break;
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    bobVar.b(34, typedArray.getDimensionPixelSize(index, bocVar.d.J));
                    break;
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    bobVar.a(37, typedArray.getFloat(index, bocVar.d.z));
                    break;
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    int resourceId = typedArray.getResourceId(index, bocVar.a);
                    bocVar.a = resourceId;
                    bobVar.b(38, resourceId);
                    break;
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                    bobVar.a(39, typedArray.getFloat(index, bocVar.d.W));
                    break;
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                    bobVar.a(40, typedArray.getFloat(index, bocVar.d.V));
                    break;
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                    bobVar.b(41, typedArray.getInt(index, bocVar.d.X));
                    break;
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                    bobVar.b(42, typedArray.getInt(index, bocVar.d.Y));
                    break;
                case R.styleable.TextInputLayout_helperText /* 43 */:
                    bobVar.a(43, typedArray.getFloat(index, bocVar.b.d));
                    break;
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                    bobVar.d(44, true);
                    bobVar.a(44, typedArray.getDimension(index, bocVar.e.o));
                    break;
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                    bobVar.a(45, typedArray.getFloat(index, bocVar.e.d));
                    break;
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                    bobVar.a(46, typedArray.getFloat(index, bocVar.e.e));
                    break;
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                    bobVar.a(47, typedArray.getFloat(index, bocVar.e.f));
                    break;
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                    bobVar.a(48, typedArray.getFloat(index, bocVar.e.g));
                    break;
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    bobVar.a(49, typedArray.getDimension(index, bocVar.e.h));
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    bobVar.a(50, typedArray.getDimension(index, bocVar.e.i));
                    break;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                    bobVar.a(51, typedArray.getDimension(index, bocVar.e.k));
                    break;
                case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                    bobVar.a(52, typedArray.getDimension(index, bocVar.e.l));
                    break;
                case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                    bobVar.a(53, typedArray.getDimension(index, bocVar.e.m));
                    break;
                case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                    bobVar.b(54, typedArray.getInt(index, bocVar.d.Z));
                    break;
                case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                    bobVar.b(55, typedArray.getInt(index, bocVar.d.aa));
                    break;
                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                    bobVar.b(56, typedArray.getDimensionPixelSize(index, bocVar.d.ab));
                    break;
                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                    bobVar.b(57, typedArray.getDimensionPixelSize(index, bocVar.d.ac));
                    break;
                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                    bobVar.b(58, typedArray.getDimensionPixelSize(index, bocVar.d.ad));
                    break;
                case R.styleable.TextInputLayout_prefixText /* 59 */:
                    bobVar.b(59, typedArray.getDimensionPixelSize(index, bocVar.d.ae));
                    break;
                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                    bobVar.a(60, typedArray.getFloat(index, bocVar.e.c));
                    break;
                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                    bobVar.b(62, typedArray.getDimensionPixelSize(index, bocVar.d.C));
                    break;
                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                    bobVar.a(63, typedArray.getFloat(index, bocVar.d.D));
                    break;
                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                    bobVar.b(64, a(typedArray, index, bocVar.c.c));
                    break;
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        bobVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        bobVar.c(65, bms.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                    bobVar.b(66, typedArray.getInt(index, 0));
                    break;
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                    bobVar.a(67, typedArray.getFloat(index, bocVar.c.j));
                    break;
                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                    bobVar.a(68, typedArray.getFloat(index, bocVar.b.e));
                    break;
                case R.styleable.TextInputLayout_startIconTint /* 69 */:
                    bobVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                    bobVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case R.styleable.TextInputLayout_suffixText /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                    bobVar.b(72, typedArray.getInt(index, bocVar.d.ah));
                    break;
                case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                    bobVar.b(73, typedArray.getDimensionPixelSize(index, bocVar.d.ai));
                    break;
                case 74:
                    bobVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    bobVar.d(75, typedArray.getBoolean(index, bocVar.d.ap));
                    break;
                case 76:
                    bobVar.b(76, typedArray.getInt(index, bocVar.c.f));
                    break;
                case 77:
                    bobVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    bobVar.b(78, typedArray.getInt(index, bocVar.b.c));
                    break;
                case 79:
                    bobVar.a(79, typedArray.getFloat(index, bocVar.c.h));
                    break;
                case 80:
                    bobVar.d(80, typedArray.getBoolean(index, bocVar.d.an));
                    break;
                case 81:
                    bobVar.d(81, typedArray.getBoolean(index, bocVar.d.ao));
                    break;
                case 82:
                    bobVar.b(82, typedArray.getInteger(index, bocVar.c.d));
                    break;
                case 83:
                    bobVar.b(83, a(typedArray, index, bocVar.e.j));
                    break;
                case 84:
                    bobVar.b(84, typedArray.getInteger(index, bocVar.c.l));
                    break;
                case 85:
                    bobVar.a(85, typedArray.getFloat(index, bocVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        bocVar.c.o = typedArray.getResourceId(index, -1);
                        bobVar.b(89, bocVar.c.o);
                        boe boeVar = bocVar.c;
                        if (boeVar.o != -1) {
                            boeVar.n = -2;
                            bobVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        bocVar.c.m = typedArray.getString(index);
                        bobVar.c(90, bocVar.c.m);
                        if (bocVar.c.m.indexOf("/") > 0) {
                            bocVar.c.o = typedArray.getResourceId(index, -1);
                            bobVar.b(89, bocVar.c.o);
                            bocVar.c.n = -2;
                            bobVar.b(88, -2);
                            break;
                        } else {
                            bocVar.c.n = -1;
                            bobVar.b(88, -1);
                            break;
                        }
                    } else {
                        boe boeVar2 = bocVar.c;
                        boeVar2.n = typedArray.getInteger(index, boeVar2.o);
                        bobVar.b(88, bocVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", t(index, "unused attribute 0x", b));
                    break;
                case 93:
                    bobVar.b(93, typedArray.getDimensionPixelSize(index, bocVar.d.N));
                    break;
                case 94:
                    bobVar.b(94, typedArray.getDimensionPixelSize(index, bocVar.d.U));
                    break;
                case 95:
                    i(bobVar, typedArray, index, 0);
                    break;
                case 96:
                    i(bobVar, typedArray, index, 1);
                    break;
                case 97:
                    bobVar.b(97, typedArray.getInt(index, bocVar.d.aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        bocVar.a = typedArray.getResourceId(index, bocVar.a);
                        break;
                    }
                case 99:
                    bobVar.d(99, typedArray.getBoolean(index, bocVar.d.i));
                    break;
            }
        }
    }

    private static final int[] q(View view, String str) {
        int length;
        int i;
        Object d;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            try {
                i = bok.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                if (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (d = ((ConstraintLayout) view.getParent()).d(trim)) != null && (d instanceof Integer)) {
                    i = ((Integer) d).intValue();
                } else {
                    i = 0;
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    private static final boc r(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        boc bocVar = new boc();
        if (z) {
            iArr = bol.c;
        } else {
            iArr = bol.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            p(bocVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    bocVar.c.b = true;
                    bocVar.d.c = true;
                    bocVar.b.a = true;
                    bocVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        bod bodVar = bocVar.d;
                        bodVar.r = a(obtainStyledAttributes, index, bodVar.r);
                        break;
                    case 2:
                        bod bodVar2 = bocVar.d;
                        bodVar2.K = obtainStyledAttributes.getDimensionPixelSize(index, bodVar2.K);
                        break;
                    case 3:
                        bod bodVar3 = bocVar.d;
                        bodVar3.q = a(obtainStyledAttributes, index, bodVar3.q);
                        break;
                    case 4:
                        bod bodVar4 = bocVar.d;
                        bodVar4.p = a(obtainStyledAttributes, index, bodVar4.p);
                        break;
                    case 5:
                        bocVar.d.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        bod bodVar5 = bocVar.d;
                        bodVar5.E = obtainStyledAttributes.getDimensionPixelOffset(index, bodVar5.E);
                        break;
                    case 7:
                        bod bodVar6 = bocVar.d;
                        bodVar6.F = obtainStyledAttributes.getDimensionPixelOffset(index, bodVar6.F);
                        break;
                    case 8:
                        bod bodVar7 = bocVar.d;
                        bodVar7.L = obtainStyledAttributes.getDimensionPixelSize(index, bodVar7.L);
                        break;
                    case 9:
                        bod bodVar8 = bocVar.d;
                        bodVar8.x = a(obtainStyledAttributes, index, bodVar8.x);
                        break;
                    case 10:
                        bod bodVar9 = bocVar.d;
                        bodVar9.w = a(obtainStyledAttributes, index, bodVar9.w);
                        break;
                    case 11:
                        bod bodVar10 = bocVar.d;
                        bodVar10.R = obtainStyledAttributes.getDimensionPixelSize(index, bodVar10.R);
                        break;
                    case 12:
                        bod bodVar11 = bocVar.d;
                        bodVar11.S = obtainStyledAttributes.getDimensionPixelSize(index, bodVar11.S);
                        break;
                    case 13:
                        bod bodVar12 = bocVar.d;
                        bodVar12.O = obtainStyledAttributes.getDimensionPixelSize(index, bodVar12.O);
                        break;
                    case 14:
                        bod bodVar13 = bocVar.d;
                        bodVar13.Q = obtainStyledAttributes.getDimensionPixelSize(index, bodVar13.Q);
                        break;
                    case 15:
                        bod bodVar14 = bocVar.d;
                        bodVar14.T = obtainStyledAttributes.getDimensionPixelSize(index, bodVar14.T);
                        break;
                    case 16:
                        bod bodVar15 = bocVar.d;
                        bodVar15.P = obtainStyledAttributes.getDimensionPixelSize(index, bodVar15.P);
                        break;
                    case 17:
                        bod bodVar16 = bocVar.d;
                        bodVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, bodVar16.f);
                        break;
                    case 18:
                        bod bodVar17 = bocVar.d;
                        bodVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, bodVar17.g);
                        break;
                    case 19:
                        bod bodVar18 = bocVar.d;
                        bodVar18.h = obtainStyledAttributes.getFloat(index, bodVar18.h);
                        break;
                    case 20:
                        bod bodVar19 = bocVar.d;
                        bodVar19.y = obtainStyledAttributes.getFloat(index, bodVar19.y);
                        break;
                    case 21:
                        bod bodVar20 = bocVar.d;
                        bodVar20.e = obtainStyledAttributes.getLayoutDimension(index, bodVar20.e);
                        break;
                    case 22:
                        bof bofVar = bocVar.b;
                        bofVar.b = obtainStyledAttributes.getInt(index, bofVar.b);
                        bof bofVar2 = bocVar.b;
                        bofVar2.b = a[bofVar2.b];
                        break;
                    case 23:
                        bod bodVar21 = bocVar.d;
                        bodVar21.d = obtainStyledAttributes.getLayoutDimension(index, bodVar21.d);
                        break;
                    case R.styleable.TextInputLayout_cursorColor /* 24 */:
                        bod bodVar22 = bocVar.d;
                        bodVar22.H = obtainStyledAttributes.getDimensionPixelSize(index, bodVar22.H);
                        break;
                    case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                        bod bodVar23 = bocVar.d;
                        bodVar23.j = a(obtainStyledAttributes, index, bodVar23.j);
                        break;
                    case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                        bod bodVar24 = bocVar.d;
                        bodVar24.k = a(obtainStyledAttributes, index, bodVar24.k);
                        break;
                    case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                        bod bodVar25 = bocVar.d;
                        bodVar25.G = obtainStyledAttributes.getInt(index, bodVar25.G);
                        break;
                    case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                        bod bodVar26 = bocVar.d;
                        bodVar26.I = obtainStyledAttributes.getDimensionPixelSize(index, bodVar26.I);
                        break;
                    case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                        bod bodVar27 = bocVar.d;
                        bodVar27.l = a(obtainStyledAttributes, index, bodVar27.l);
                        break;
                    case R.styleable.TextInputLayout_endIconMode /* 30 */:
                        bod bodVar28 = bocVar.d;
                        bodVar28.m = a(obtainStyledAttributes, index, bodVar28.m);
                        break;
                    case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                        bod bodVar29 = bocVar.d;
                        bodVar29.M = obtainStyledAttributes.getDimensionPixelSize(index, bodVar29.M);
                        break;
                    case R.styleable.TextInputLayout_endIconTint /* 32 */:
                        bod bodVar30 = bocVar.d;
                        bodVar30.u = a(obtainStyledAttributes, index, bodVar30.u);
                        break;
                    case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                        bod bodVar31 = bocVar.d;
                        bodVar31.v = a(obtainStyledAttributes, index, bodVar31.v);
                        break;
                    case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                        bod bodVar32 = bocVar.d;
                        bodVar32.J = obtainStyledAttributes.getDimensionPixelSize(index, bodVar32.J);
                        break;
                    case 35:
                        bod bodVar33 = bocVar.d;
                        bodVar33.o = a(obtainStyledAttributes, index, bodVar33.o);
                        break;
                    case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                        bod bodVar34 = bocVar.d;
                        bodVar34.n = a(obtainStyledAttributes, index, bodVar34.n);
                        break;
                    case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                        bod bodVar35 = bocVar.d;
                        bodVar35.z = obtainStyledAttributes.getFloat(index, bodVar35.z);
                        break;
                    case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                        bocVar.a = obtainStyledAttributes.getResourceId(index, bocVar.a);
                        break;
                    case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                        bod bodVar36 = bocVar.d;
                        bodVar36.W = obtainStyledAttributes.getFloat(index, bodVar36.W);
                        break;
                    case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                        bod bodVar37 = bocVar.d;
                        bodVar37.V = obtainStyledAttributes.getFloat(index, bodVar37.V);
                        break;
                    case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                        bod bodVar38 = bocVar.d;
                        bodVar38.X = obtainStyledAttributes.getInt(index, bodVar38.X);
                        break;
                    case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                        bod bodVar39 = bocVar.d;
                        bodVar39.Y = obtainStyledAttributes.getInt(index, bodVar39.Y);
                        break;
                    case R.styleable.TextInputLayout_helperText /* 43 */:
                        bof bofVar3 = bocVar.b;
                        bofVar3.d = obtainStyledAttributes.getFloat(index, bofVar3.d);
                        break;
                    case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                        bog bogVar = bocVar.e;
                        bogVar.n = true;
                        bogVar.o = obtainStyledAttributes.getDimension(index, bogVar.o);
                        break;
                    case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                        bog bogVar2 = bocVar.e;
                        bogVar2.d = obtainStyledAttributes.getFloat(index, bogVar2.d);
                        break;
                    case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                        bog bogVar3 = bocVar.e;
                        bogVar3.e = obtainStyledAttributes.getFloat(index, bogVar3.e);
                        break;
                    case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                        bog bogVar4 = bocVar.e;
                        bogVar4.f = obtainStyledAttributes.getFloat(index, bogVar4.f);
                        break;
                    case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                        bog bogVar5 = bocVar.e;
                        bogVar5.g = obtainStyledAttributes.getFloat(index, bogVar5.g);
                        break;
                    case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                        bog bogVar6 = bocVar.e;
                        bogVar6.h = obtainStyledAttributes.getDimension(index, bogVar6.h);
                        break;
                    case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                        bog bogVar7 = bocVar.e;
                        bogVar7.i = obtainStyledAttributes.getDimension(index, bogVar7.i);
                        break;
                    case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                        bog bogVar8 = bocVar.e;
                        bogVar8.k = obtainStyledAttributes.getDimension(index, bogVar8.k);
                        break;
                    case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                        bog bogVar9 = bocVar.e;
                        bogVar9.l = obtainStyledAttributes.getDimension(index, bogVar9.l);
                        break;
                    case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                        bog bogVar10 = bocVar.e;
                        bogVar10.m = obtainStyledAttributes.getDimension(index, bogVar10.m);
                        break;
                    case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                        bod bodVar40 = bocVar.d;
                        bodVar40.Z = obtainStyledAttributes.getInt(index, bodVar40.Z);
                        break;
                    case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                        bod bodVar41 = bocVar.d;
                        bodVar41.aa = obtainStyledAttributes.getInt(index, bodVar41.aa);
                        break;
                    case R.styleable.TextInputLayout_placeholderText /* 56 */:
                        bod bodVar42 = bocVar.d;
                        bodVar42.ab = obtainStyledAttributes.getDimensionPixelSize(index, bodVar42.ab);
                        break;
                    case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                        bod bodVar43 = bocVar.d;
                        bodVar43.ac = obtainStyledAttributes.getDimensionPixelSize(index, bodVar43.ac);
                        break;
                    case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                        bod bodVar44 = bocVar.d;
                        bodVar44.ad = obtainStyledAttributes.getDimensionPixelSize(index, bodVar44.ad);
                        break;
                    case R.styleable.TextInputLayout_prefixText /* 59 */:
                        bod bodVar45 = bocVar.d;
                        bodVar45.ae = obtainStyledAttributes.getDimensionPixelSize(index, bodVar45.ae);
                        break;
                    case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                        bog bogVar11 = bocVar.e;
                        bogVar11.c = obtainStyledAttributes.getFloat(index, bogVar11.c);
                        break;
                    case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                        bod bodVar46 = bocVar.d;
                        bodVar46.B = a(obtainStyledAttributes, index, bodVar46.B);
                        break;
                    case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                        bod bodVar47 = bocVar.d;
                        bodVar47.C = obtainStyledAttributes.getDimensionPixelSize(index, bodVar47.C);
                        break;
                    case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                        bod bodVar48 = bocVar.d;
                        bodVar48.D = obtainStyledAttributes.getFloat(index, bodVar48.D);
                        break;
                    case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                        boe boeVar = bocVar.c;
                        boeVar.c = a(obtainStyledAttributes, index, boeVar.c);
                        break;
                    case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            bocVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            bocVar.c.e = bms.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                        bocVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                        boe boeVar2 = bocVar.c;
                        boeVar2.j = obtainStyledAttributes.getFloat(index, boeVar2.j);
                        break;
                    case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                        bof bofVar4 = bocVar.b;
                        bofVar4.e = obtainStyledAttributes.getFloat(index, bofVar4.e);
                        break;
                    case R.styleable.TextInputLayout_startIconTint /* 69 */:
                        bocVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                        bocVar.d.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case R.styleable.TextInputLayout_suffixText /* 71 */:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                        bod bodVar49 = bocVar.d;
                        bodVar49.ah = obtainStyledAttributes.getInt(index, bodVar49.ah);
                        break;
                    case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                        bod bodVar50 = bocVar.d;
                        bodVar50.ai = obtainStyledAttributes.getDimensionPixelSize(index, bodVar50.ai);
                        break;
                    case 74:
                        bocVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        bod bodVar51 = bocVar.d;
                        bodVar51.ap = obtainStyledAttributes.getBoolean(index, bodVar51.ap);
                        break;
                    case 76:
                        boe boeVar3 = bocVar.c;
                        boeVar3.f = obtainStyledAttributes.getInt(index, boeVar3.f);
                        break;
                    case 77:
                        bocVar.d.am = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        bof bofVar5 = bocVar.b;
                        bofVar5.c = obtainStyledAttributes.getInt(index, bofVar5.c);
                        break;
                    case 79:
                        boe boeVar4 = bocVar.c;
                        boeVar4.h = obtainStyledAttributes.getFloat(index, boeVar4.h);
                        break;
                    case 80:
                        bod bodVar52 = bocVar.d;
                        bodVar52.an = obtainStyledAttributes.getBoolean(index, bodVar52.an);
                        break;
                    case 81:
                        bod bodVar53 = bocVar.d;
                        bodVar53.ao = obtainStyledAttributes.getBoolean(index, bodVar53.ao);
                        break;
                    case 82:
                        boe boeVar5 = bocVar.c;
                        boeVar5.d = obtainStyledAttributes.getInteger(index, boeVar5.d);
                        break;
                    case 83:
                        bog bogVar12 = bocVar.e;
                        bogVar12.j = a(obtainStyledAttributes, index, bogVar12.j);
                        break;
                    case 84:
                        boe boeVar6 = bocVar.c;
                        boeVar6.l = obtainStyledAttributes.getInteger(index, boeVar6.l);
                        break;
                    case 85:
                        boe boeVar7 = bocVar.c;
                        boeVar7.k = obtainStyledAttributes.getFloat(index, boeVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            bocVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            boe boeVar8 = bocVar.c;
                            if (boeVar8.o != -1) {
                                boeVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            bocVar.c.m = obtainStyledAttributes.getString(index);
                            if (bocVar.c.m.indexOf("/") > 0) {
                                bocVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                bocVar.c.n = -2;
                                break;
                            } else {
                                bocVar.c.n = -1;
                                break;
                            }
                        } else {
                            boe boeVar9 = bocVar.c;
                            boeVar9.n = obtainStyledAttributes.getInteger(index, boeVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", t(index, "unused attribute 0x", sparseIntArray));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", t(index, "Unknown attribute 0x", sparseIntArray));
                        break;
                    case 91:
                        bod bodVar54 = bocVar.d;
                        bodVar54.s = a(obtainStyledAttributes, index, bodVar54.s);
                        break;
                    case 92:
                        bod bodVar55 = bocVar.d;
                        bodVar55.t = a(obtainStyledAttributes, index, bodVar55.t);
                        break;
                    case 93:
                        bod bodVar56 = bocVar.d;
                        bodVar56.N = obtainStyledAttributes.getDimensionPixelSize(index, bodVar56.N);
                        break;
                    case 94:
                        bod bodVar57 = bocVar.d;
                        bodVar57.U = obtainStyledAttributes.getDimensionPixelSize(index, bodVar57.U);
                        break;
                    case 95:
                        i(bocVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i(bocVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        bod bodVar58 = bocVar.d;
                        bodVar58.aq = obtainStyledAttributes.getInt(index, bodVar58.aq);
                        break;
                }
            }
            bod bodVar59 = bocVar.d;
            if (bodVar59.al != null) {
                bodVar59.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return bocVar;
    }

    private static final String s(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return "end";
                    }
                    return "start";
                }
                return "baseline";
            }
            return "bottom";
        }
        return "top";
    }

    private static /* synthetic */ String t(int i, String str, SparseIntArray sparseIntArray) {
        return str + Integer.toHexString(i) + "   " + sparseIntArray.get(i);
    }

    public final void b(ConstraintLayout constraintLayout) {
        m(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        boh bohVar = this;
        int childCount = constraintLayout.getChildCount();
        bohVar.e.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            bnx bnxVar = (bnx) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = bohVar.e;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    bohVar.e.put(valueOf, new boc());
                }
                boc bocVar = (boc) bohVar.e.get(valueOf);
                if (bocVar == null) {
                    i = childCount;
                } else {
                    HashMap hashMap2 = bohVar.d;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        bnu bnuVar = (bnu) hashMap2.get(str);
                        int i3 = childCount;
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap3.put(str, new bnu(bnuVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                hashMap3.put(str, new bnu(bnuVar, cls.getMethod(a.ao(str, "getMap"), null).invoke(childAt, null)));
                            }
                        } catch (IllegalAccessException e) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
                        }
                        childCount = i3;
                    }
                    i = childCount;
                    bocVar.f = hashMap3;
                    bocVar.a = id;
                    int i4 = bnxVar.e;
                    bod bodVar = bocVar.d;
                    bodVar.j = i4;
                    bodVar.k = bnxVar.f;
                    bodVar.l = bnxVar.g;
                    bodVar.m = bnxVar.h;
                    bodVar.n = bnxVar.i;
                    bodVar.o = bnxVar.j;
                    bodVar.p = bnxVar.k;
                    bodVar.q = bnxVar.l;
                    bodVar.r = bnxVar.m;
                    bodVar.s = bnxVar.n;
                    bodVar.t = bnxVar.o;
                    bodVar.u = bnxVar.s;
                    bodVar.v = bnxVar.t;
                    bodVar.w = bnxVar.u;
                    bodVar.x = bnxVar.v;
                    bodVar.y = bnxVar.G;
                    bodVar.z = bnxVar.H;
                    bodVar.A = bnxVar.I;
                    bodVar.B = bnxVar.p;
                    bodVar.C = bnxVar.q;
                    bodVar.D = bnxVar.r;
                    bodVar.E = bnxVar.X;
                    bodVar.F = bnxVar.Y;
                    bodVar.G = bnxVar.Z;
                    bodVar.h = bnxVar.c;
                    bodVar.f = bnxVar.a;
                    bodVar.g = bnxVar.b;
                    bodVar.d = bnxVar.width;
                    bocVar.d.e = bnxVar.height;
                    bocVar.d.H = bnxVar.leftMargin;
                    bocVar.d.I = bnxVar.rightMargin;
                    bocVar.d.J = bnxVar.topMargin;
                    bocVar.d.K = bnxVar.bottomMargin;
                    int i5 = bnxVar.D;
                    bod bodVar2 = bocVar.d;
                    bodVar2.N = i5;
                    bodVar2.V = bnxVar.M;
                    bodVar2.W = bnxVar.L;
                    bodVar2.Y = bnxVar.O;
                    bodVar2.X = bnxVar.N;
                    bodVar2.an = bnxVar.aa;
                    bodVar2.ao = bnxVar.ab;
                    bodVar2.Z = bnxVar.P;
                    bodVar2.aa = bnxVar.Q;
                    bodVar2.ab = bnxVar.T;
                    bodVar2.ac = bnxVar.U;
                    bodVar2.ad = bnxVar.R;
                    bodVar2.ae = bnxVar.S;
                    bodVar2.af = bnxVar.V;
                    bodVar2.ag = bnxVar.W;
                    bodVar2.am = bnxVar.ac;
                    bodVar2.P = bnxVar.x;
                    bodVar2.R = bnxVar.z;
                    bodVar2.O = bnxVar.w;
                    bodVar2.Q = bnxVar.y;
                    bodVar2.T = bnxVar.A;
                    bodVar2.S = bnxVar.B;
                    bodVar2.U = bnxVar.C;
                    bodVar2.aq = bnxVar.ad;
                    bodVar2.L = bnxVar.getMarginEnd();
                    bocVar.d.M = bnxVar.getMarginStart();
                    bocVar.b.b = childAt.getVisibility();
                    bocVar.b.d = childAt.getAlpha();
                    bocVar.e.c = childAt.getRotation();
                    bocVar.e.d = childAt.getRotationX();
                    bocVar.e.e = childAt.getRotationY();
                    bocVar.e.f = childAt.getScaleX();
                    bocVar.e.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        bog bogVar = bocVar.e;
                        bogVar.h = pivotX;
                        bogVar.i = pivotY;
                    }
                    bocVar.e.k = childAt.getTranslationX();
                    bocVar.e.l = childAt.getTranslationY();
                    bocVar.e.m = childAt.getTranslationZ();
                    bog bogVar2 = bocVar.e;
                    if (bogVar2.n) {
                        bogVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        bod bodVar3 = bocVar.d;
                        bodVar3.ap = barrier.b.b;
                        bodVar3.ak = Arrays.copyOf(barrier.c, barrier.d);
                        bod bodVar4 = bocVar.d;
                        bodVar4.ah = barrier.a;
                        bodVar4.ai = barrier.b.c;
                    }
                }
                i2++;
                bohVar = this;
                childCount = i;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void d(boh bohVar) {
        this.e.clear();
        for (Integer num : bohVar.e.keySet()) {
            boc bocVar = (boc) bohVar.e.get(num);
            if (bocVar != null) {
                this.e.put(num, bocVar.clone());
            }
        }
    }

    public final void e(Context context, int i) {
        c((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void f(int i, int i2, int i3, int i4) {
        bod bodVar;
        HashMap hashMap = this.e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.e.put(valueOf, new boc());
        }
        boc bocVar = (boc) this.e.get(valueOf);
        if (bocVar == null) {
            return;
        }
        if (i2 != 3) {
            bodVar = bocVar.d;
            if (i4 == 4) {
                bodVar.q = i3;
                bodVar.p = -1;
            } else {
                bodVar.p = i3;
                bodVar.q = -1;
            }
        } else {
            bodVar = bocVar.d;
            if (i4 == 3) {
                bodVar.n = i3;
                bodVar.o = -1;
            } else {
                bodVar.o = i3;
                bodVar.n = -1;
            }
        }
        bodVar.r = -1;
        bodVar.s = -1;
        bodVar.t = -1;
    }

    public final void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    boc r = r(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        r.d.b = true;
                    }
                    this.e.put(Integer.valueOf(r.a), r);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.ae(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.ae(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0079. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00e7. Please report as an issue. */
    public final void h(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            boc bocVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c3 = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                                if (c3 == 1 || c3 == 2 || c3 == 3) {
                                    try {
                                        this.e.put(Integer.valueOf(bocVar.a), bocVar);
                                        bocVar = null;
                                    } catch (IOException e) {
                                        e = e;
                                        Log.e("ConstraintSet", "Error parsing XML resource", e);
                                        return;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        Log.e("ConstraintSet", "Error parsing XML resource", e);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                bocVar = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                bocVar = r(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                bocVar = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                bod bodVar = bocVar.d;
                                bodVar.b = true;
                                bodVar.c = true;
                                break;
                            case 3:
                                bocVar = r(context, Xml.asAttributeSet(xmlPullParser), false);
                                bocVar.d.aj = 1;
                                break;
                            case 4:
                                if (bocVar != null) {
                                    bof bofVar = bocVar.b;
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), bol.g);
                                    bofVar.a = true;
                                    int indexCount = obtainStyledAttributes.getIndexCount();
                                    for (int i = 0; i < indexCount; i++) {
                                        int index = obtainStyledAttributes.getIndex(i);
                                        if (index == 1) {
                                            bofVar.d = obtainStyledAttributes.getFloat(1, bofVar.d);
                                        } else if (index == 0) {
                                            int i2 = obtainStyledAttributes.getInt(0, bofVar.b);
                                            bofVar.b = i2;
                                            bofVar.b = a[i2];
                                        } else {
                                            if (index == 4) {
                                                bofVar.c = obtainStyledAttributes.getInt(4, bofVar.c);
                                            } else if (index == 3) {
                                                bofVar.e = obtainStyledAttributes.getFloat(3, bofVar.e);
                                            }
                                        }
                                    }
                                    obtainStyledAttributes.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 5:
                                if (bocVar != null) {
                                    bog bogVar = bocVar.e;
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), bol.i);
                                    bogVar.b = true;
                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                    for (int i3 = 0; i3 < indexCount2; i3++) {
                                        int index2 = obtainStyledAttributes2.getIndex(i3);
                                        switch (bog.a.get(index2)) {
                                            case 1:
                                                bogVar.c = obtainStyledAttributes2.getFloat(index2, bogVar.c);
                                                break;
                                            case 2:
                                                bogVar.d = obtainStyledAttributes2.getFloat(index2, bogVar.d);
                                                break;
                                            case 3:
                                                bogVar.e = obtainStyledAttributes2.getFloat(index2, bogVar.e);
                                                break;
                                            case 4:
                                                bogVar.f = obtainStyledAttributes2.getFloat(index2, bogVar.f);
                                                break;
                                            case 5:
                                                bogVar.g = obtainStyledAttributes2.getFloat(index2, bogVar.g);
                                                break;
                                            case 6:
                                                bogVar.h = obtainStyledAttributes2.getDimension(index2, bogVar.h);
                                                break;
                                            case 7:
                                                bogVar.i = obtainStyledAttributes2.getDimension(index2, bogVar.i);
                                                break;
                                            case 8:
                                                bogVar.k = obtainStyledAttributes2.getDimension(index2, bogVar.k);
                                                break;
                                            case 9:
                                                bogVar.l = obtainStyledAttributes2.getDimension(index2, bogVar.l);
                                                break;
                                            case 10:
                                                bogVar.m = obtainStyledAttributes2.getDimension(index2, bogVar.m);
                                                break;
                                            case 11:
                                                bogVar.n = true;
                                                bogVar.o = obtainStyledAttributes2.getDimension(index2, bogVar.o);
                                                break;
                                            case 12:
                                                bogVar.j = a(obtainStyledAttributes2, index2, bogVar.j);
                                                break;
                                        }
                                    }
                                    obtainStyledAttributes2.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 6:
                                if (bocVar != null) {
                                    bod bodVar2 = bocVar.d;
                                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), bol.e);
                                    bodVar2.c = true;
                                    int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount3; i4++) {
                                        int index3 = obtainStyledAttributes3.getIndex(i4);
                                        int i5 = bod.a.get(index3);
                                        switch (i5) {
                                            case 1:
                                                bodVar2.r = a(obtainStyledAttributes3, index3, bodVar2.r);
                                                break;
                                            case 2:
                                                bodVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.K);
                                                break;
                                            case 3:
                                                bodVar2.q = a(obtainStyledAttributes3, index3, bodVar2.q);
                                                break;
                                            case 4:
                                                bodVar2.p = a(obtainStyledAttributes3, index3, bodVar2.p);
                                                break;
                                            case 5:
                                                bodVar2.A = obtainStyledAttributes3.getString(index3);
                                                break;
                                            case 6:
                                                bodVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, bodVar2.E);
                                                break;
                                            case 7:
                                                bodVar2.F = obtainStyledAttributes3.getDimensionPixelOffset(index3, bodVar2.F);
                                                break;
                                            case 8:
                                                bodVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.L);
                                                break;
                                            case 9:
                                                bodVar2.x = a(obtainStyledAttributes3, index3, bodVar2.x);
                                                break;
                                            case 10:
                                                bodVar2.w = a(obtainStyledAttributes3, index3, bodVar2.w);
                                                break;
                                            case 11:
                                                bodVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.R);
                                                break;
                                            case 12:
                                                bodVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.S);
                                                break;
                                            case 13:
                                                bodVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.O);
                                                break;
                                            case 14:
                                                bodVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.Q);
                                                break;
                                            case 15:
                                                bodVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.T);
                                                break;
                                            case 16:
                                                bodVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.P);
                                                break;
                                            case 17:
                                                bodVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, bodVar2.f);
                                                break;
                                            case 18:
                                                bodVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, bodVar2.g);
                                                break;
                                            case 19:
                                                bodVar2.h = obtainStyledAttributes3.getFloat(index3, bodVar2.h);
                                                break;
                                            case 20:
                                                bodVar2.y = obtainStyledAttributes3.getFloat(index3, bodVar2.y);
                                                break;
                                            case 21:
                                                bodVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, bodVar2.e);
                                                break;
                                            case 22:
                                                bodVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, bodVar2.d);
                                                break;
                                            case 23:
                                                bodVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.H);
                                                break;
                                            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                                                bodVar2.j = a(obtainStyledAttributes3, index3, bodVar2.j);
                                                break;
                                            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                                                bodVar2.k = a(obtainStyledAttributes3, index3, bodVar2.k);
                                                break;
                                            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                                                bodVar2.G = obtainStyledAttributes3.getInt(index3, bodVar2.G);
                                                break;
                                            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                                                bodVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.I);
                                                break;
                                            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                                                bodVar2.l = a(obtainStyledAttributes3, index3, bodVar2.l);
                                                break;
                                            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                                                bodVar2.m = a(obtainStyledAttributes3, index3, bodVar2.m);
                                                break;
                                            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                                                bodVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.M);
                                                break;
                                            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                                                bodVar2.u = a(obtainStyledAttributes3, index3, bodVar2.u);
                                                break;
                                            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                                                bodVar2.v = a(obtainStyledAttributes3, index3, bodVar2.v);
                                                break;
                                            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                                                bodVar2.J = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.J);
                                                break;
                                            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                                                bodVar2.o = a(obtainStyledAttributes3, index3, bodVar2.o);
                                                break;
                                            case 35:
                                                bodVar2.n = a(obtainStyledAttributes3, index3, bodVar2.n);
                                                break;
                                            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                                                bodVar2.z = obtainStyledAttributes3.getFloat(index3, bodVar2.z);
                                                break;
                                            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                                                bodVar2.W = obtainStyledAttributes3.getFloat(index3, bodVar2.W);
                                                break;
                                            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                                                bodVar2.V = obtainStyledAttributes3.getFloat(index3, bodVar2.V);
                                                break;
                                            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                                                bodVar2.X = obtainStyledAttributes3.getInt(index3, bodVar2.X);
                                                break;
                                            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                                                bodVar2.Y = obtainStyledAttributes3.getInt(index3, bodVar2.Y);
                                                break;
                                            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                                                i(bodVar2, obtainStyledAttributes3, index3, 0);
                                                break;
                                            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                                                i(bodVar2, obtainStyledAttributes3, index3, 1);
                                                break;
                                            default:
                                                switch (i5) {
                                                    case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                                                        bodVar2.B = a(obtainStyledAttributes3, index3, bodVar2.B);
                                                        break;
                                                    case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                                                        bodVar2.C = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.C);
                                                        break;
                                                    case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                                                        bodVar2.D = obtainStyledAttributes3.getFloat(index3, bodVar2.D);
                                                        break;
                                                    default:
                                                        switch (i5) {
                                                            case R.styleable.TextInputLayout_startIconTint /* 69 */:
                                                                bodVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                                                                bodVar2.ag = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case R.styleable.TextInputLayout_suffixText /* 71 */:
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                                                                bodVar2.ah = obtainStyledAttributes3.getInt(index3, bodVar2.ah);
                                                                break;
                                                            case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                                                                bodVar2.ai = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.ai);
                                                                break;
                                                            case 74:
                                                                bodVar2.al = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 75:
                                                                bodVar2.ap = obtainStyledAttributes3.getBoolean(index3, bodVar2.ap);
                                                                break;
                                                            case 76:
                                                                bodVar2.aq = obtainStyledAttributes3.getInt(index3, bodVar2.aq);
                                                                break;
                                                            case 77:
                                                                bodVar2.s = a(obtainStyledAttributes3, index3, bodVar2.s);
                                                                break;
                                                            case 78:
                                                                bodVar2.t = a(obtainStyledAttributes3, index3, bodVar2.t);
                                                                break;
                                                            case 79:
                                                                bodVar2.U = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.U);
                                                                break;
                                                            case 80:
                                                                bodVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.N);
                                                                break;
                                                            case 81:
                                                                bodVar2.Z = obtainStyledAttributes3.getInt(index3, bodVar2.Z);
                                                                break;
                                                            case 82:
                                                                bodVar2.aa = obtainStyledAttributes3.getInt(index3, bodVar2.aa);
                                                                break;
                                                            case 83:
                                                                bodVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.ac);
                                                                break;
                                                            case 84:
                                                                bodVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.ab);
                                                                break;
                                                            case 85:
                                                                bodVar2.ae = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.ae);
                                                                break;
                                                            case 86:
                                                                bodVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, bodVar2.ad);
                                                                break;
                                                            case 87:
                                                                bodVar2.an = obtainStyledAttributes3.getBoolean(index3, bodVar2.an);
                                                                break;
                                                            case 88:
                                                                bodVar2.ao = obtainStyledAttributes3.getBoolean(index3, bodVar2.ao);
                                                                break;
                                                            case 89:
                                                                bodVar2.am = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 90:
                                                                bodVar2.i = obtainStyledAttributes3.getBoolean(index3, bodVar2.i);
                                                                break;
                                                            case 91:
                                                                Log.w("ConstraintSet", t(index3, "unused attribute 0x", bod.a));
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", t(index3, "Unknown attribute 0x", bod.a));
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                    obtainStyledAttributes3.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 7:
                                if (bocVar != null) {
                                    boe boeVar = bocVar.c;
                                    TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), bol.f);
                                    boeVar.b = true;
                                    int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                    for (int i6 = 0; i6 < indexCount4; i6++) {
                                        int index4 = obtainStyledAttributes4.getIndex(i6);
                                        switch (boe.a.get(index4)) {
                                            case 1:
                                                boeVar.j = obtainStyledAttributes4.getFloat(index4, boeVar.j);
                                                break;
                                            case 2:
                                                boeVar.f = obtainStyledAttributes4.getInt(index4, boeVar.f);
                                                break;
                                            case 3:
                                                if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                    boeVar.e = obtainStyledAttributes4.getString(index4);
                                                    break;
                                                } else {
                                                    boeVar.e = bms.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                    break;
                                                }
                                            case 4:
                                                boeVar.g = obtainStyledAttributes4.getInt(index4, 0);
                                                break;
                                            case 5:
                                                boeVar.c = a(obtainStyledAttributes4, index4, boeVar.c);
                                                break;
                                            case 6:
                                                boeVar.d = obtainStyledAttributes4.getInteger(index4, boeVar.d);
                                                break;
                                            case 7:
                                                boeVar.h = obtainStyledAttributes4.getFloat(index4, boeVar.h);
                                                break;
                                            case 8:
                                                boeVar.l = obtainStyledAttributes4.getInteger(index4, boeVar.l);
                                                break;
                                            case 9:
                                                boeVar.k = obtainStyledAttributes4.getFloat(index4, boeVar.k);
                                                break;
                                            case 10:
                                                TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                                if (peekValue.type == 1) {
                                                    int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    boeVar.o = resourceId;
                                                    if (resourceId != -1) {
                                                        boeVar.n = -2;
                                                        break;
                                                    }
                                                } else if (peekValue.type == 3) {
                                                    boeVar.m = obtainStyledAttributes4.getString(index4);
                                                    if (boeVar.m.indexOf("/") > 0) {
                                                        boeVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                        boeVar.n = -2;
                                                        break;
                                                    } else {
                                                        boeVar.n = -1;
                                                        break;
                                                    }
                                                } else {
                                                    boeVar.n = obtainStyledAttributes4.getInteger(index4, boeVar.o);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    obtainStyledAttributes4.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (bocVar != null) {
                                    HashMap hashMap = bocVar.f;
                                    TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), bol.d);
                                    int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                    String str = null;
                                    Object obj2 = null;
                                    int i7 = 0;
                                    boolean z = false;
                                    for (int i8 = 0; i8 < indexCount5; i8++) {
                                        int index5 = obtainStyledAttributes5.getIndex(i8);
                                        if (index5 == 0) {
                                            String string = obtainStyledAttributes5.getString(0);
                                            if (string != null && string.length() > 0) {
                                                str = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                            } else {
                                                str = string;
                                            }
                                        } else if (index5 == 10) {
                                            str = obtainStyledAttributes5.getString(10);
                                            z = true;
                                        } else if (index5 == 1) {
                                            obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                            i7 = 6;
                                        } else if (index5 == 3) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                            i7 = 3;
                                        } else if (index5 == 2) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(2, 0));
                                            i7 = 4;
                                        } else {
                                            if (index5 == 7) {
                                                obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                            } else if (index5 == 4) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, 0.0f));
                                            } else if (index5 == 5) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                                i7 = 2;
                                            } else if (index5 == 6) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                                i7 = 1;
                                            } else if (index5 == 9) {
                                                obj2 = obtainStyledAttributes5.getString(9);
                                                i7 = 5;
                                            } else if (index5 == 8) {
                                                int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                                if (resourceId2 == -1) {
                                                    resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                                }
                                                obj2 = Integer.valueOf(resourceId2);
                                                i7 = 8;
                                            }
                                            i7 = 7;
                                        }
                                    }
                                    String str2 = str;
                                    if (str2 != null && (obj = obj2) != null) {
                                        hashMap.put(str2, new bnu(str2, i7, obj, z));
                                    }
                                    obtainStyledAttributes5.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    public final void k(int i, int i2) {
        o(i).d.g = i2;
        o(i).d.f = -1;
        o(i).d.h = -1.0f;
    }

    public final void l(int i, int i2) {
        o(i).b.b = i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00f1. Please report as an issue. */
    public final void m(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        String str;
        int i;
        HashMap hashMap;
        String str2;
        int i2;
        int i3;
        int i4;
        boh bohVar = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(bohVar.e.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout3.getChildAt(i5);
            int id = childAt.getId();
            HashMap hashMap2 = bohVar.e;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap2.containsKey(valueOf)) {
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(str)));
            } else if (id != -1) {
                if (id != -1 && bohVar.e.containsKey(valueOf)) {
                    hashSet.remove(valueOf);
                    boc bocVar = (boc) bohVar.e.get(valueOf);
                    if (bocVar != null) {
                        if (childAt instanceof Barrier) {
                            bocVar.d.aj = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            bod bodVar = bocVar.d;
                            barrier.a = bodVar.ah;
                            barrier.b(bodVar.ai);
                            bod bodVar2 = bocVar.d;
                            barrier.b.b = bodVar2.ap;
                            int[] iArr = bodVar2.ak;
                            if (iArr != null) {
                                barrier.j(iArr);
                            } else {
                                String str3 = bodVar2.al;
                                if (str3 != null) {
                                    bodVar2.ak = q(barrier, str3);
                                    barrier.j(bocVar.d.ak);
                                }
                            }
                        }
                        bnx bnxVar = (bnx) childAt.getLayoutParams();
                        bnxVar.a();
                        bocVar.b(bnxVar);
                        HashMap hashMap3 = bocVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str4 : hashMap3.keySet()) {
                            bnu bnuVar = (bnu) hashMap3.get(str4);
                            if (!bnuVar.a) {
                                hashMap = hashMap3;
                                str2 = "set".concat(String.valueOf(str4));
                            } else {
                                hashMap = hashMap3;
                                str2 = str4;
                            }
                            try {
                                i3 = bnuVar.h;
                                i4 = i3 - 1;
                            } catch (IllegalAccessException e) {
                                e = e;
                                i2 = childCount;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                i2 = childCount;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                i2 = childCount;
                            }
                            if (i3 != 0) {
                                switch (i4) {
                                    case 0:
                                        i2 = childCount;
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(str2, clsArr).invoke(childAt, Integer.valueOf(bnuVar.c));
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        }
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                    case 1:
                                        i2 = childCount;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(bnuVar.d));
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 2:
                                        i2 = childCount;
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(bnuVar.g));
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 3:
                                        i2 = childCount;
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(bnuVar.g);
                                        method.invoke(childAt, colorDrawable);
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 4:
                                        i2 = childCount;
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, bnuVar.e);
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 5:
                                        i2 = childCount;
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bnuVar.f));
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 6:
                                        i2 = childCount;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(bnuVar.d));
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                        break;
                                    case 7:
                                        i2 = childCount;
                                        try {
                                            cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(bnuVar.c));
                                        } catch (IllegalAccessException e7) {
                                            e = e7;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        } catch (NoSuchMethodException e8) {
                                            e = e8;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        } catch (InvocationTargetException e9) {
                                            e = e9;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashMap3 = hashMap;
                                            childCount = i2;
                                        }
                                        hashMap3 = hashMap;
                                        childCount = i2;
                                    default:
                                        hashMap3 = hashMap;
                                        break;
                                }
                            } else {
                                i2 = childCount;
                                throw null;
                            }
                        }
                        i = childCount;
                        childAt.setLayoutParams(bnxVar);
                        bof bofVar = bocVar.b;
                        if (bofVar.c == 0) {
                            childAt.setVisibility(bofVar.b);
                        }
                        childAt.setAlpha(bocVar.b.d);
                        childAt.setRotation(bocVar.e.c);
                        childAt.setRotationX(bocVar.e.d);
                        childAt.setRotationY(bocVar.e.e);
                        childAt.setScaleX(bocVar.e.f);
                        childAt.setScaleY(bocVar.e.g);
                        bog bogVar = bocVar.e;
                        if (bogVar.j != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(bocVar.e.j);
                            if (findViewById != null) {
                                int top = findViewById.getTop() + findViewById.getBottom();
                                int left = findViewById.getLeft() + findViewById.getRight();
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float f = left;
                                    float left2 = childAt.getLeft();
                                    float top2 = childAt.getTop();
                                    childAt.setPivotX((f / 2.0f) - left2);
                                    childAt.setPivotY((top / 2.0f) - top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(bogVar.h)) {
                                childAt.setPivotX(bocVar.e.h);
                            }
                            if (!Float.isNaN(bocVar.e.i)) {
                                childAt.setPivotY(bocVar.e.i);
                            }
                        }
                        childAt.setTranslationX(bocVar.e.k);
                        childAt.setTranslationY(bocVar.e.l);
                        childAt.setTranslationZ(bocVar.e.m);
                        bog bogVar2 = bocVar.e;
                        if (bogVar2.n) {
                            childAt.setElevation(bogVar2.o);
                        }
                        i5++;
                        bohVar = this;
                        constraintLayout3 = constraintLayout;
                        childCount = i;
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            i = childCount;
            i5++;
            bohVar = this;
            constraintLayout3 = constraintLayout;
            childCount = i;
        }
        int i6 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            boc bocVar2 = (boc) this.e.get(num);
            if (bocVar2 != null) {
                if (bocVar2.d.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    bod bodVar3 = bocVar2.d;
                    int[] iArr2 = bodVar3.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str5 = bodVar3.al;
                        if (str5 != null) {
                            bodVar3.ak = q(barrier2, str5);
                            barrier2.j(bocVar2.d.ak);
                        }
                    }
                    bod bodVar4 = bocVar2.d;
                    barrier2.a = bodVar4.ah;
                    barrier2.b(bodVar4.ai);
                    bnx bnxVar2 = new bnx();
                    barrier2.k();
                    bocVar2.b(bnxVar2);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView(barrier2, bnxVar2);
                } else {
                    constraintLayout2 = constraintLayout;
                }
                if (bocVar2.d.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    bnx bnxVar3 = new bnx();
                    bocVar2.b(bnxVar3);
                    constraintLayout2.addView(guideline, bnxVar3);
                }
            }
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof bnv) {
                ((bnv) childAt2).g(constraintLayout);
            }
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        bod bodVar;
        HashMap hashMap = this.e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.e.put(valueOf, new boc());
        }
        boc bocVar = (boc) this.e.get(valueOf);
        if (bocVar == null) {
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        if (i4 == 7) {
                            bod bodVar2 = bocVar.d;
                            bodVar2.x = i3;
                            bodVar2.w = -1;
                        } else if (i4 == 6) {
                            bod bodVar3 = bocVar.d;
                            bodVar3.w = i3;
                            bodVar3.x = -1;
                        } else {
                            throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                        }
                        bocVar.d.L = 0;
                        return;
                    }
                    if (i4 == 6) {
                        bod bodVar4 = bocVar.d;
                        bodVar4.v = i3;
                        bodVar4.u = -1;
                    } else if (i4 == 7) {
                        bod bodVar5 = bocVar.d;
                        bodVar5.u = i3;
                        bodVar5.v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                    }
                    bocVar.d.M = 0;
                    return;
                }
                if (i4 == 5) {
                    bod bodVar6 = bocVar.d;
                    bodVar6.r = i3;
                    bodVar6.q = -1;
                    bodVar6.p = -1;
                    bodVar6.n = -1;
                    bodVar6.o = -1;
                    return;
                }
                if (i4 == 3) {
                    bod bodVar7 = bocVar.d;
                    bodVar7.s = i3;
                    bodVar7.q = -1;
                    bodVar7.p = -1;
                    bodVar7.n = -1;
                    bodVar7.o = -1;
                    return;
                }
                if (i4 == 4) {
                    bod bodVar8 = bocVar.d;
                    bodVar8.t = i3;
                    bodVar8.q = -1;
                    bodVar8.p = -1;
                    bodVar8.n = -1;
                    bodVar8.o = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + s(i4) + " undefined");
            }
            if (i4 == 4) {
                bod bodVar9 = bocVar.d;
                bodVar9.q = i3;
                bodVar9.p = -1;
                bodVar9.r = -1;
                bodVar9.s = -1;
                bodVar9.t = -1;
            } else if (i4 == 3) {
                bod bodVar10 = bocVar.d;
                bodVar10.p = i3;
                bodVar10.q = -1;
                bodVar10.r = -1;
                bodVar10.s = -1;
                bodVar10.t = -1;
            } else {
                throw new IllegalArgumentException("right to " + s(i4) + " undefined");
            }
            bocVar.d.K = 0;
            return;
        }
        if (i4 == 3) {
            bodVar = bocVar.d;
            bodVar.n = i3;
            bodVar.o = -1;
        } else if (i4 == 4) {
            bodVar = bocVar.d;
            bodVar.o = i3;
            bodVar.n = -1;
        } else {
            throw new IllegalArgumentException("right to " + s(i4) + " undefined");
        }
        bodVar.r = -1;
        bodVar.s = -1;
        bodVar.t = -1;
        bocVar.d.J = 0;
    }
}
