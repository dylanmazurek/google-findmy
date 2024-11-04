package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imz implements imx {
    private final Object a;

    public imz(imx imxVar) {
        this.a = imxVar;
    }

    public static final int a(String str) {
        if (str == null) {
            return imy.a[0];
        }
        return imy.a[Math.abs(str.hashCode()) % 21];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence b(njz njzVar) {
        String str;
        if (njzVar == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = (String[]) njzVar.a;
            if (i >= strArr.length) {
                return null;
            }
            String str2 = strArr[i];
            if (str2 != null && !str2.isEmpty() && !str2.equals(".")) {
                if (str2.length() > 2) {
                    ina inaVar = (ina) ((imz) this.a).a;
                    hwx.U(inaVar.e);
                    Object obj = (ta) inaVar.d.get();
                    if (obj == null) {
                        str = null;
                    } else {
                        int length = str2.length();
                        str = null;
                        for (int i2 = 0; i2 < length && obj != null; i2++) {
                            lyn lynVar = (lyn) ((ta) obj).get(Character.valueOf(str2.charAt(i2)));
                            if (lynVar == null) {
                                break;
                            }
                            Object obj2 = lynVar.b;
                            if (obj2 != 0) {
                                str = obj2;
                            }
                            obj = lynVar.a;
                        }
                    }
                    if (str == null) {
                        str2 = new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString();
                    } else {
                        str2 = str;
                    }
                }
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
            i++;
        }
    }

    public imz(ina inaVar) {
        this.a = inaVar;
        if (inaVar.e) {
            return;
        }
        jyz submit = inaVar.c.submit(new kqg(inaVar, 1));
        submit.c(new hka(inaVar, submit, 16), jxv.a);
        inaVar.e = true;
    }
}
