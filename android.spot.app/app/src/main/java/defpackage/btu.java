package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btu {
    public static final String a;
    public static final String b;
    public static final btu c;
    public static final btu d;
    public static final lzl g;
    public final boolean e;
    public final int f = 2;
    public final lzl h;

    static {
        lzl lzlVar = bub.c;
        g = lzlVar;
        a = Character.toString((char) 8206);
        b = Character.toString((char) 8207);
        c = new btu(false, lzlVar);
        d = new btu(true, lzlVar);
    }

    public btu(boolean z, lzl lzlVar) {
        this.e = z;
        this.h = lzlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:            return 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:            if (r1 != 0) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:            if (r2 != 0) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:            if (r0.c <= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:            switch(r0.a()) {            case 14: goto L62;            case 15: goto L62;            case 16: goto L61;            case 17: goto L61;            case 18: goto L60;            default: goto L67;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0078, code lost:            r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:            if (r1 != r3) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:            r3 = r3 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007f, code lost:            if (r1 != r3) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0087, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:            return 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            btt r0 = new btt
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L67
            if (r1 != 0) goto L67
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L39
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.c
            int r4 = java.lang.Character.codePointAt(r4, r5)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L44
        L39:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            byte r4 = defpackage.btt.b(r4)
        L44:
            if (r4 == 0) goto L62
            if (r4 == r7) goto L5f
            r5 = 2
            if (r4 == r5) goto L5f
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L5b;
                case 15: goto L5b;
                case 16: goto L57;
                case 17: goto L57;
                case 18: goto L53;
                default: goto L52;
            }
        L52:
            goto L65
        L53:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L57:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L5b:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L5f:
            if (r3 != 0) goto L65
            goto L7d
        L62:
            if (r3 != 0) goto L65
            goto L81
        L65:
            r1 = r3
            goto Lb
        L67:
            if (r1 != 0) goto L6a
            goto L87
        L6a:
            if (r2 != 0) goto L86
        L6c:
            int r2 = r0.c
            if (r2 <= 0) goto L87
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L7f;
                case 15: goto L7f;
                case 16: goto L7b;
                case 17: goto L7b;
                case 18: goto L78;
                default: goto L77;
            }
        L77:
            goto L6c
        L78:
            int r3 = r3 + 1
            goto L6c
        L7b:
            if (r1 != r3) goto L83
        L7d:
            r9 = 1
            goto L87
        L7f:
            if (r1 != r3) goto L83
        L81:
            r9 = -1
            goto L87
        L83:
            int r3 = r3 + (-1)
            goto L6c
        L86:
            r9 = r2
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btu.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0021. Please report as an issue. */
    public static int b(CharSequence charSequence) {
        btt bttVar = new btt(charSequence);
        bttVar.c = bttVar.b;
        int i = 0;
        int i2 = 0;
        while (bttVar.c > 0) {
            byte a2 = bttVar.a();
            if (a2 != 0) {
                if (a2 != 1 && a2 != 2) {
                    if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }
}
