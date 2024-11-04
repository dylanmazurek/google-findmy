package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfw {
    public static final Logger a = Logger.getLogger(mfw.class.getName());

    private mfw() {
    }

    public static Object a(kwr kwrVar) {
        boolean z;
        boolean z2;
        String f;
        String str;
        double parseDouble;
        hwx.V(kwrVar.i(), "unexpected end of JSON");
        int j = kwrVar.j() - 1;
        boolean z3 = true;
        if (j != 0) {
            char c = '\"';
            if (j != 2) {
                if (j != 5) {
                    if (j != 6) {
                        if (j != 7) {
                            if (j == 8) {
                                int i = kwrVar.c;
                                if (i == 0) {
                                    i = kwrVar.a();
                                }
                                if (i == 7) {
                                    kwrVar.c = 0;
                                    int[] iArr = kwrVar.i;
                                    int i2 = kwrVar.g - 1;
                                    iArr[i2] = iArr[i2] + 1;
                                    return null;
                                }
                                throw kwrVar.c("null");
                            }
                            throw new IllegalStateException("Bad token: ".concat(kwrVar.d()));
                        }
                        int i3 = kwrVar.c;
                        if (i3 == 0) {
                            i3 = kwrVar.a();
                        }
                        if (i3 == 5) {
                            kwrVar.c = 0;
                            int[] iArr2 = kwrVar.i;
                            int i4 = kwrVar.g - 1;
                            iArr2[i4] = iArr2[i4] + 1;
                        } else if (i3 == 6) {
                            kwrVar.c = 0;
                            int[] iArr3 = kwrVar.i;
                            int i5 = kwrVar.g - 1;
                            iArr3[i5] = iArr3[i5] + 1;
                            z3 = false;
                        } else {
                            throw kwrVar.c("a boolean");
                        }
                        return Boolean.valueOf(z3);
                    }
                    int i6 = kwrVar.c;
                    if (i6 == 0) {
                        i6 = kwrVar.a();
                    }
                    if (i6 == 15) {
                        kwrVar.c = 0;
                        int[] iArr4 = kwrVar.i;
                        int i7 = kwrVar.g - 1;
                        iArr4[i7] = iArr4[i7] + 1;
                        parseDouble = kwrVar.d;
                    } else {
                        if (i6 == 16) {
                            char[] cArr = kwrVar.a;
                            int i8 = kwrVar.b;
                            int i9 = kwrVar.e;
                            kwrVar.f = new String(cArr, i8, i9);
                            kwrVar.b = i8 + i9;
                        } else if (i6 != 8 && i6 != 9) {
                            if (i6 == 10) {
                                kwrVar.f = kwrVar.g();
                            } else if (i6 != 11) {
                                throw kwrVar.c("a double");
                            }
                        } else {
                            if (i6 == 8) {
                                c = '\'';
                            }
                            kwrVar.f = kwrVar.f(c);
                        }
                        kwrVar.c = 11;
                        parseDouble = Double.parseDouble(kwrVar.f);
                        if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                            kwrVar.f = null;
                            kwrVar.c = 0;
                            int[] iArr5 = kwrVar.i;
                            int i10 = kwrVar.g - 1;
                            iArr5[i10] = iArr5[i10] + 1;
                        } else {
                            throw kwrVar.b("JSON forbids NaN and infinities: " + parseDouble);
                        }
                    }
                    return Double.valueOf(parseDouble);
                }
                int i11 = kwrVar.c;
                if (i11 == 0) {
                    i11 = kwrVar.a();
                }
                if (i11 == 10) {
                    str = kwrVar.g();
                } else if (i11 == 8) {
                    str = kwrVar.f('\'');
                } else if (i11 == 9) {
                    str = kwrVar.f('\"');
                } else if (i11 == 11) {
                    str = kwrVar.f;
                    kwrVar.f = null;
                } else if (i11 == 15) {
                    str = Long.toString(kwrVar.d);
                } else if (i11 == 16) {
                    String str2 = new String(kwrVar.a, kwrVar.b, kwrVar.e);
                    kwrVar.b += kwrVar.e;
                    str = str2;
                } else {
                    throw kwrVar.c("a string");
                }
                kwrVar.c = 0;
                int[] iArr6 = kwrVar.i;
                int i12 = kwrVar.g - 1;
                iArr6[i12] = iArr6[i12] + 1;
                return str;
            }
            int i13 = kwrVar.c;
            if (i13 == 0) {
                i13 = kwrVar.a();
            }
            if (i13 == 1) {
                kwrVar.h(3);
                kwrVar.c = 0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (kwrVar.i()) {
                    int i14 = kwrVar.c;
                    if (i14 == 0) {
                        i14 = kwrVar.a();
                    }
                    if (i14 == 14) {
                        f = kwrVar.g();
                    } else if (i14 == 12) {
                        f = kwrVar.f('\'');
                    } else if (i14 == 13) {
                        f = kwrVar.f('\"');
                    } else {
                        throw kwrVar.c("a name");
                    }
                    kwrVar.c = 0;
                    kwrVar.h[kwrVar.g - 1] = f;
                    linkedHashMap.put(f, a(kwrVar));
                }
                if (kwrVar.j() == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.V(z2, "Bad token: ".concat(kwrVar.d()));
                int i15 = kwrVar.c;
                if (i15 == 0) {
                    i15 = kwrVar.a();
                }
                if (i15 == 2) {
                    int i16 = kwrVar.g;
                    int i17 = i16 - 1;
                    kwrVar.g = i17;
                    kwrVar.h[i17] = null;
                    int[] iArr7 = kwrVar.i;
                    int i18 = i16 - 2;
                    iArr7[i18] = iArr7[i18] + 1;
                    kwrVar.c = 0;
                    return DesugarCollections.unmodifiableMap(linkedHashMap);
                }
                throw kwrVar.c("END_OBJECT");
            }
            throw kwrVar.c("BEGIN_OBJECT");
        }
        int i19 = kwrVar.c;
        if (i19 == 0) {
            i19 = kwrVar.a();
        }
        if (i19 == 3) {
            kwrVar.h(1);
            kwrVar.i[kwrVar.g - 1] = 0;
            kwrVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (kwrVar.i()) {
                arrayList.add(a(kwrVar));
            }
            if (kwrVar.j() == 2) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "Bad token: ".concat(kwrVar.d()));
            int i20 = kwrVar.c;
            if (i20 == 0) {
                i20 = kwrVar.a();
            }
            if (i20 == 4) {
                int i21 = kwrVar.g;
                kwrVar.g = i21 - 1;
                int[] iArr8 = kwrVar.i;
                int i22 = i21 - 2;
                iArr8[i22] = iArr8[i22] + 1;
                kwrVar.c = 0;
                return DesugarCollections.unmodifiableList(arrayList);
            }
            throw kwrVar.c("END_ARRAY");
        }
        throw kwrVar.c("BEGIN_ARRAY");
    }
}
