package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvt implements Comparable, Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    public final String a;
    public final String b;
    public final String c;
    public transient Charset d;
    private final String e;
    private final String f;
    private volatile transient jvv g;
    private volatile transient String h;

    public jvt(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.a = str;
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.d = charset;
        this.h = str6;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.d = Charset.forName((String) readObject);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.d.name());
    }

    public final jvv a() {
        jvv jvvVar;
        int i;
        String f;
        if (this.g == null) {
            String str = this.f;
            if (str == null) {
                jvvVar = jvv.a;
            } else {
                Charset charset = this.d;
                jvv jvvVar2 = jvv.a;
                charset.getClass();
                jvv jvvVar3 = new jvv(new jks(12));
                if (!str.isEmpty()) {
                    String name = charset.name();
                    int length = name.length();
                    int i2 = 0;
                    boolean z = true;
                    if ((length < 9 || !name.regionMatches(true, length - 9, "SHIFT_JIS", 0, 9)) && (length < 11 || !name.regionMatches(true, length - 11, "WINDOWS-31J", 0, 11))) {
                        z = false;
                    }
                    while (i2 <= str.length()) {
                        int indexOf = str.indexOf(38, i2);
                        if (indexOf == -1) {
                            indexOf = str.length();
                        }
                        int indexOf2 = str.indexOf(61, i2);
                        if (indexOf2 > indexOf) {
                            indexOf2 = -1;
                        }
                        if (indexOf2 == -1) {
                            i = indexOf;
                        } else {
                            i = indexOf2;
                        }
                        String f2 = jvv.f(str, i2, i, charset, z);
                        if (indexOf2 == -1) {
                            f = "";
                        } else {
                            f = jvv.f(str, indexOf2 + 1, indexOf, charset, z);
                        }
                        jvvVar3.o(f2, f);
                        i2 = indexOf + 1;
                    }
                }
                jvvVar = new jvv(new jly(jvvVar3.b));
            }
            this.g = jvvVar;
        }
        return this.g;
    }

    public final List c() {
        char c;
        boolean z;
        int parseInt;
        ArrayList arrayList = new ArrayList();
        if (ivc.o(this.e)) {
            arrayList.add("");
            return arrayList;
        }
        List<String> d = kru.f('/').d(this.e);
        if ("".equals(d.get(0))) {
            d = d.subList(1, d.size());
        }
        for (String str : d) {
            Charset charset = this.d;
            Charset charset2 = jvu.a;
            str.getClass();
            charset.getClass();
            int indexOf = str.indexOf(37);
            if (indexOf >= 0) {
                mjp mjpVar = new mjp(str.length(), charset);
                StringBuilder sb = new StringBuilder(str.length());
                if (indexOf > 0) {
                    sb.append((CharSequence) str, 0, indexOf);
                }
                while (indexOf < str.length()) {
                    char charAt = str.charAt(indexOf);
                    if (charAt < 128) {
                        if (charAt == '%') {
                            int i = indexOf + 3;
                            if (str.length() >= i) {
                                int i2 = indexOf + 1;
                                if (str.charAt(i2) != '+' && str.charAt(i2) != '-') {
                                    try {
                                        parseInt = Integer.parseInt(str.substring(i2, i), 16);
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (parseInt >= 0) {
                                        mjpVar.a((byte) parseInt);
                                        indexOf += 2;
                                        z = true;
                                        c = '%';
                                    }
                                }
                            }
                            z = false;
                            c = '%';
                        } else {
                            c = charAt;
                            z = false;
                        }
                        if (!z) {
                            if (mjpVar.b == 0) {
                                sb.append(c);
                            } else {
                                mjpVar.a((byte) c);
                            }
                        }
                    } else {
                        mjpVar.b(sb);
                        sb.append(charAt);
                    }
                    indexOf++;
                }
                mjpVar.b(sb);
                str = sb.toString();
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jvt jvtVar = (jvt) obj;
        jvtVar.getClass();
        return toString().compareTo(jvtVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jvt)) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        int i;
        if (this.h == null) {
            String str = this.a;
            if (str != null) {
                i = str.length() + 1;
            } else {
                i = 0;
            }
            String str2 = this.b;
            if (str2 != null) {
                i += str2.length() + 2;
            }
            String str3 = this.e;
            if (str3 != null) {
                i += str3.length();
            }
            String str4 = this.f;
            if (str4 != null) {
                i += str4.length() + 1;
            }
            String str5 = this.c;
            if (str5 != null) {
                i += str5.length() + 1;
            }
            StringBuilder sb = new StringBuilder(i);
            String str6 = this.a;
            if (str6 != null) {
                sb.append(str6);
                sb.append(':');
            }
            if (this.b != null) {
                sb.append("//");
                sb.append(this.b);
            }
            String str7 = this.e;
            if (str7 != null) {
                sb.append(str7);
            }
            if (this.f != null) {
                sb.append('?');
                sb.append(this.f);
            }
            if (this.c != null) {
                sb.append('#');
                sb.append(this.c);
            }
            this.h = sb.toString();
        }
        return this.h;
    }

    public jvt(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.a = b(str);
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.d = charset;
    }
}
