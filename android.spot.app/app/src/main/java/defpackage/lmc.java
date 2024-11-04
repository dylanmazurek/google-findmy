package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lmc extends lja {
    public lmc() {
        super(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lja
    public final nqe b(lkq lkqVar, int i) {
        char c;
        String name = lkqVar.getClass().getName();
        switch (name.hashCode()) {
            case 102135:
                if (name.equals("gbr")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 102136:
                if (name.equals("gbs")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 103672:
                if (name.equals("hue")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 105593:
                if (name.equals("jud")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 105610:
                if (name.equals("juu")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4 && i == 334728578) {
                            return huk.j;
                        }
                        return null;
                    }
                    if (i != 118) {
                        if (i == 126) {
                            return jui.b;
                        }
                        return null;
                    }
                    return jup.b;
                }
                switch (i) {
                    case 100000001:
                        return gck.a;
                    case 100000002:
                        return gck.b;
                    case 100000003:
                        return gdt.b;
                    default:
                        return null;
                }
            }
            switch (i) {
                case 100000004:
                    return gbz.a;
                case 100000005:
                    return gec.a;
                case 100000007:
                    return gdu.a;
                case 100000013:
                    return gdu.b;
                case 100000015:
                    return gej.a;
                case 100000016:
                    return geh.a;
                case 100000017:
                    return gcy.a;
                case 100000018:
                    return gdw.a;
                case 100000022:
                    return gdg.a;
                case 200000028:
                    return gdt.a;
                case 200000050:
                    return hjm.a;
                default:
                    return null;
            }
        }
        if (i != 508) {
            if (i != 571) {
                if (i != 618) {
                    if (i != 772) {
                        return null;
                    }
                    return juc.c;
                }
                return jui.a;
            }
            return jus.f;
        }
        return juk.a;
    }
}
