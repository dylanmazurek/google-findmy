package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddt implements dem {
    private int a;

    public ddt(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [float[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [float[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.dem
    public final /* bridge */ /* synthetic */ Object a(dep depVar, float f) {
        int i;
        float f2;
        Object obj;
        int i2;
        float f3;
        int argb;
        float f4;
        ArrayList arrayList = new ArrayList();
        int p = depVar.p();
        if (p == 1) {
            depVar.g();
        }
        while (depVar.n()) {
            arrayList.add(Float.valueOf((float) depVar.a()));
        }
        int i3 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (p == 1) {
            depVar.i();
        }
        int i4 = this.a;
        if (i4 == -1) {
            i4 = arrayList.size() / 4;
            this.a = i4;
        }
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.a * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double floatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            iArr[i8] = Color.argb(255, i6, i7, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i7 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i6 = (int) (floatValue * 255.0d);
                }
            } else {
                float f5 = (float) floatValue;
                if (i8 > 0 && fArr[i8 - 1] >= f5) {
                    fArr[i8] = f5 + 0.01f;
                } else {
                    fArr[i8] = f5;
                }
            }
            i5++;
        }
        elo eloVar = new elo(fArr, iArr);
        if (arrayList.size() > i) {
            Object obj2 = eloVar.a;
            Object obj3 = eloVar.b;
            int size = (arrayList.size() - i) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i10 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    fArr2[i10] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    fArr3[i10] = ((Float) arrayList.get(i)).floatValue();
                    i10++;
                }
                i++;
            }
            float[] fArr4 = eloVar.a;
            float[] fArr5 = (float[]) fArr4;
            int length = fArr5.length;
            if (length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int i11 = length + size;
                fArr4 = new float[i11];
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    float f6 = Float.NaN;
                    if (i13 < fArr5.length) {
                        f2 = fArr5[i13];
                    } else {
                        f2 = Float.NaN;
                    }
                    if (i14 < size) {
                        f6 = fArr2[i14];
                    }
                    if (!Float.isNaN(f6) && f2 >= f6) {
                        i14++;
                        if (!Float.isNaN(f2) && f6 >= f2) {
                            i13++;
                            fArr4[i15] = f2;
                            i12++;
                        } else {
                            fArr4[i15] = f6;
                        }
                    } else {
                        fArr4[i15] = f2;
                        i13++;
                    }
                }
                if (i12 != 0) {
                    fArr4 = Arrays.copyOf((float[]) fArr4, i11 - i12);
                }
            }
            float[] fArr6 = fArr4;
            int length2 = fArr6.length;
            int[] iArr2 = new int[length2];
            int i16 = 0;
            while (i16 < length2) {
                float f7 = fArr6[i16];
                float[] fArr7 = (float[]) obj2;
                int binarySearch = Arrays.binarySearch(fArr7, f7);
                int binarySearch2 = Arrays.binarySearch(fArr2, f7);
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i17 = ((int[]) obj3)[binarySearch];
                    if (size >= i3 && f7 > fArr2[0]) {
                        for (int i18 = 1; i18 < size; i18++) {
                            float f8 = fArr2[i18];
                            if (f8 >= f7 || i18 == size - 1) {
                                if (f8 <= f7) {
                                    f4 = fArr3[i18];
                                } else {
                                    int i19 = i18 - 1;
                                    float f9 = fArr2[i19];
                                    float f10 = f8 - f9;
                                    float f11 = f7 - f9;
                                    float f12 = fArr3[i19];
                                    float f13 = fArr3[i18];
                                    PointF pointF = dew.a;
                                    f4 = f12 + ((f11 / f10) * (f13 - f12));
                                }
                                argb = Color.argb((int) (f4 * 255.0f), Color.red(i17), Color.green(i17), Color.blue(i17));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i17), Color.green(i17), Color.blue(i17));
                    iArr2[i16] = argb;
                    obj = obj2;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f14 = fArr3[binarySearch2];
                    int[] iArr3 = (int[]) obj3;
                    obj = obj2;
                    if (iArr3.length >= 2 && f7 != fArr7[0]) {
                        int i20 = 1;
                        while (true) {
                            int length3 = fArr7.length;
                            if (i20 < length3) {
                                f3 = fArr7[i20];
                                if (f3 >= f7 || i20 == length3 - 1) {
                                    break;
                                }
                                i20++;
                            } else {
                                throw new IllegalArgumentException("Unreachable code.");
                            }
                        }
                        int i21 = i20 - 1;
                        float f15 = fArr7[i21];
                        int i22 = iArr3[i20];
                        int i23 = iArr3[i21];
                        float f16 = (f7 - f15) / (f3 - f15);
                        i2 = Color.argb((int) (f14 * 255.0f), bpv.f(f16, Color.red(i23), Color.red(i22)), bpv.f(f16, Color.green(i23), Color.green(i22)), bpv.f(f16, Color.blue(i23), Color.blue(i22)));
                    } else {
                        i2 = iArr3[0];
                    }
                    iArr2[i16] = i2;
                }
                i16++;
                obj2 = obj;
                i3 = 2;
            }
            return new elo(fArr4, iArr2);
        }
        return eloVar;
    }
}
