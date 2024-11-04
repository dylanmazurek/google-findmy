package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpf {
    public final gpe a;
    public final gpe b;
    public final Integer c;
    public final String d;
    public final byte[] e;
    public final String f;
    public final int g;
    private final String h;
    private final String i;

    public gpf() {
        throw null;
    }

    public static gpf a(Intent intent) {
        Integer valueOf;
        Integer num;
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        String stringExtra = intent.getStringExtra("casp");
        String stringExtra2 = intent.getStringExtra("chm");
        gpe e = e(intent.getStringExtra("google.original_priority"));
        gpe e2 = e(intent.getStringExtra("google.delivered_priority"));
        int d = d(intent.getStringExtra("message_type"));
        String stringExtra3 = intent.getStringExtra("ki");
        String str = null;
        if (!intent.hasExtra("google.ttl")) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        }
        if (valueOf == null) {
            num = null;
        } else {
            num = valueOf;
        }
        String stringExtra4 = intent.getStringExtra("google.message_id");
        if (true != TextUtils.isEmpty(stringExtra4)) {
            str = stringExtra4;
        }
        return new gpf(str, d, e, e2, num, stringExtra, byteArrayExtra, stringExtra2, stringExtra3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -2062414158:
                if (str.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 102161:
                if (str.equals("gcm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 814694033:
                if (str.equals("send_error")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 814800675:
                if (str.equals("send_event")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 3;
        }
        if (c != 2) {
            if (c != 3) {
                return 1;
            }
            return 5;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.gpe e(java.lang.String r3) {
        /*
            if (r3 != 0) goto L3
            goto L2c
        L3:
            int r0 = r3.hashCode()
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            r2 = 1
            if (r0 == r1) goto L1d
            r1 = 3202466(0x30dda2, float:4.48761E-39)
            if (r0 == r1) goto L13
            goto L27
        L13:
            java.lang.String r0 = "high"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L1d:
            java.lang.String r0 = "normal"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L27
            r3 = 0
            goto L28
        L27:
            r3 = -1
        L28:
            if (r3 == 0) goto L32
            if (r3 == r2) goto L2f
        L2c:
            gpe r3 = defpackage.gpe.PRIORITY_UNKNOWN
            return r3
        L2f:
            gpe r3 = defpackage.gpe.PRIORITY_HIGH
            return r3
        L32:
            gpe r3 = defpackage.gpe.PRIORITY_NORMAL
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpf.e(java.lang.String):gpe");
    }

    private static int f(gpe gpeVar) {
        if (gpeVar == null) {
            return 1;
        }
        int ordinal = gpeVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return 1;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lcj b() {
        /*
            r7 = this;
            lcj r0 = defpackage.lcj.f
            ljh r0 = r0.k()
            gpe r1 = r7.a
            int r1 = f(r1)
            ljn r2 = r0.b
            boolean r2 = r2.y()
            if (r2 != 0) goto L17
            r0.t()
        L17:
            ljn r2 = r0.b
            lcj r2 = (defpackage.lcj) r2
            int r1 = r1 + (-1)
            r2.d = r1
            int r1 = r2.a
            r3 = 4
            r1 = r1 | r3
            r2.a = r1
            gpe r1 = r7.b
            int r1 = f(r1)
            ljn r2 = r0.b
            boolean r2 = r2.y()
            if (r2 != 0) goto L36
            r0.t()
        L36:
            ljn r2 = r0.b
            r4 = r2
            lcj r4 = (defpackage.lcj) r4
            int r1 = r1 + (-1)
            r4.e = r1
            int r1 = r4.a
            r1 = r1 | 8
            r4.a = r1
            int r1 = r7.g
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L4d
        L4b:
            r3 = 1
            goto L5e
        L4d:
            int r1 = r1 + (-1)
            if (r1 == r5) goto L5d
            r6 = 3
            if (r1 == r4) goto L5b
            if (r1 == r6) goto L5e
            if (r1 == r3) goto L59
            goto L4b
        L59:
            r3 = 5
            goto L5e
        L5b:
            r3 = 3
            goto L5e
        L5d:
            r3 = 2
        L5e:
            boolean r1 = r2.y()
            if (r1 != 0) goto L67
            r0.t()
        L67:
            ljn r1 = r0.b
            lcj r1 = (defpackage.lcj) r1
            int r3 = r3 + (-1)
            r1.c = r3
            int r2 = r1.a
            r2 = r2 | r4
            r1.a = r2
            java.lang.String r1 = r7.h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L97
            java.lang.String r1 = r7.h
            ljn r2 = r0.b
            boolean r2 = r2.y()
            if (r2 != 0) goto L89
            r0.t()
        L89:
            ljn r2 = r0.b
            lcj r2 = (defpackage.lcj) r2
            r1.getClass()
            int r3 = r2.a
            r3 = r3 | r5
            r2.a = r3
            r2.b = r1
        L97:
            ljn r0 = r0.q()
            lcj r0 = (defpackage.lcj) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpf.b():lcj");
    }

    public final boolean c() {
        String str;
        String str2 = this.d;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        if (this.e != null && (str = this.i) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpf) {
            gpf gpfVar = (gpf) obj;
            String str2 = this.h;
            if (str2 != null ? str2.equals(gpfVar.h) : gpfVar.h == null) {
                int i = this.g;
                if (i != 0 ? i == gpfVar.g : gpfVar.g == 0) {
                    gpe gpeVar = this.a;
                    if (gpeVar != null ? gpeVar.equals(gpfVar.a) : gpfVar.a == null) {
                        gpe gpeVar2 = this.b;
                        if (gpeVar2 != null ? gpeVar2.equals(gpfVar.b) : gpfVar.b == null) {
                            Integer num = this.c;
                            if (num != null ? num.equals(gpfVar.c) : gpfVar.c == null) {
                                String str3 = this.d;
                                if (str3 != null ? str3.equals(gpfVar.d) : gpfVar.d == null) {
                                    byte[] bArr2 = this.e;
                                    if (gpfVar instanceof gpf) {
                                        bArr = gpfVar.e;
                                    } else {
                                        bArr = gpfVar.e;
                                    }
                                    if (Arrays.equals(bArr2, bArr) && ((str = this.i) != null ? str.equals(gpfVar.i) : gpfVar.i == null)) {
                                        String str4 = this.f;
                                        String str5 = gpfVar.f;
                                        if (str4 != null ? str4.equals(str5) : str5 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = this.g;
        if (i2 == 0) {
            i2 = 0;
        } else {
            a.N(i2);
        }
        int i3 = hashCode ^ 1000003;
        gpe gpeVar = this.a;
        if (gpeVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gpeVar.hashCode();
        }
        int i4 = ((((i3 * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003;
        gpe gpeVar2 = this.b;
        if (gpeVar2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gpeVar2.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Integer num = this.c;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int hashCode7 = (((i6 ^ hashCode5) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str3 = this.i;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (hashCode7 ^ hashCode6) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i7 ^ i;
    }

    public final String toString() {
        String str;
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "SEND_ERROR";
                        }
                    } else {
                        str = "SEND_EVENT";
                    }
                } else {
                    str = "DELETED";
                }
            } else {
                str = "MESSAGE";
            }
        } else {
            str = "MESSAGE_TYPE_UNSPECIFIED";
        }
        String str2 = this.h;
        gpe gpeVar = this.a;
        gpe gpeVar2 = this.b;
        Integer num = this.c;
        String str3 = this.d;
        byte[] bArr = this.e;
        String str4 = this.i;
        String str5 = this.f;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + String.valueOf(gpeVar) + ", priorityDelivered=" + String.valueOf(gpeVar2) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + "}";
    }

    public gpf(String str, int i, gpe gpeVar, gpe gpeVar2, Integer num, String str2, byte[] bArr, String str3, String str4) {
        this.h = str;
        this.g = i;
        this.a = gpeVar;
        this.b = gpeVar2;
        this.c = num;
        this.d = str2;
        this.e = bArr;
        this.i = str3;
        this.f = str4;
    }
}
