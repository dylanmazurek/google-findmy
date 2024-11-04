package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.StrictMode;
import android.support.design.widget.R;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwx {
    public static volatile hwx a;
    private static volatile hwx b;

    public hwx() {
    }

    public static void A(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static void B(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw new NullPointerException(der.c(obj, "null value in entry: ", "=null"));
            }
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
    }

    public static void C(boolean z) {
        V(z, "no calls to next() since the last call to remove()");
    }

    public static void D(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void E(boolean z) {
        if (z) {
        } else {
            throw new jfl();
        }
    }

    public static void F(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new jfl(I(str, obj));
        }
    }

    public static void G(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
        } else {
            throw new jfl(I("expected a non-null reference", objArr));
        }
    }

    public static jfe H(jfe jfeVar) {
        if (!(jfeVar instanceof jfg) && !(jfeVar instanceof jff)) {
            if (jfeVar instanceof Serializable) {
                return new jff(jfeVar);
            }
            return new jfg(jfeVar);
        }
        return jfeVar;
    }

    public static String I(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void J(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void K(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void L(boolean z, String str, char c) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, Character.valueOf(c)));
        }
    }

    public static void M(boolean z, String str, int i) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, Integer.valueOf(i)));
        }
    }

    public static void N(boolean z, String str, long j) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, Long.valueOf(j)));
        }
    }

    public static void O(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, obj));
        }
    }

    public static void P(boolean z, String str, int i, int i2) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void Q(boolean z, String str, Object obj, int i) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, obj, Integer.valueOf(i)));
        }
    }

    public static void R(boolean z, String str, Object obj, long j) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, obj, Long.valueOf(j)));
        }
    }

    public static void S(boolean z, String str, Object obj, Object obj2) {
        if (z) {
        } else {
            throw new IllegalArgumentException(I(str, obj, obj2));
        }
    }

    public static void T(int i, int i2, int i3) {
        String at;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                at = I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                at = at(i2, i3, "end index");
            }
        } else {
            at = at(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(at);
    }

    public static void U(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void V(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void W(boolean z, String str, int i) {
        if (z) {
        } else {
            throw new IllegalStateException(I(str, Integer.valueOf(i)));
        }
    }

    public static void X(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(I(str, obj));
        }
    }

    public static void Y(boolean z, String str, Object obj, Object obj2) {
        if (z) {
        } else {
            throw new IllegalStateException(I(str, obj, obj2));
        }
    }

    public static void Z(int i, int i2) {
        String I;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(a.ae(i2, "negative size: "));
            }
            I = I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            I = I("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(I);
    }

    public static void a() {
        if (b == null) {
            synchronized (hwx.class) {
                if (b == null) {
                    b = new hxa();
                }
            }
        }
    }

    public static void aa(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(at(i, i2, "index"));
        }
    }

    public static int ab(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static int ac(int i) {
        return i - 2;
    }

    public static int ad(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                return 25;
            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return 26;
            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return 27;
            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                return 28;
            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                return 29;
            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                return 30;
            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                return 31;
            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
            case 108:
            case 279:
            case 317:
            case 373:
            case 413:
            case 423:
            case 425:
            case 462:
            case 533:
            case 534:
            case 544:
            case 545:
            case 577:
            default:
                return 0;
            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                return 33;
            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                return 34;
            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                return 35;
            case 35:
                return 36;
            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                return 37;
            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                return 38;
            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                return 39;
            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                return 40;
            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                return 41;
            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                return 42;
            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                return 43;
            case R.styleable.TextInputLayout_helperText /* 43 */:
                return 44;
            case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                return 45;
            case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                return 46;
            case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                return 47;
            case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                return 48;
            case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                return 49;
            case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                return 50;
            case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                return 51;
            case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                return 52;
            case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                return 53;
            case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                return 54;
            case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                return 55;
            case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                return 56;
            case R.styleable.TextInputLayout_placeholderText /* 56 */:
                return 57;
            case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                return 58;
            case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                return 59;
            case R.styleable.TextInputLayout_prefixText /* 59 */:
                return 60;
            case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                return 61;
            case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                return 62;
            case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                return 63;
            case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                return 64;
            case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                return 65;
            case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                return 66;
            case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                return 67;
            case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                return 68;
            case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                return 69;
            case R.styleable.TextInputLayout_startIconTint /* 69 */:
                return 70;
            case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                return 71;
            case R.styleable.TextInputLayout_suffixText /* 71 */:
                return 72;
            case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                return 73;
            case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return 255;
            case 255:
                return 256;
            case 256:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 266:
                return 267;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 276:
                return 277;
            case 277:
                return 278;
            case 278:
                return 279;
            case 280:
                return 281;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
            case 296:
                return 297;
            case 297:
                return 298;
            case 298:
                return 299;
            case 299:
                return 300;
            case 300:
                return 301;
            case 301:
                return 302;
            case 302:
                return 303;
            case 303:
                return 304;
            case 304:
                return 305;
            case 305:
                return 306;
            case 306:
                return 307;
            case 307:
                return 308;
            case 308:
                return 309;
            case 309:
                return 310;
            case 310:
                return 311;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 316:
                return 317;
            case 318:
                return 319;
            case 319:
                return 320;
            case 320:
                return 321;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 326:
                return 327;
            case 327:
                return 328;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 335:
                return 336;
            case 336:
                return 337;
            case 337:
                return 338;
            case 338:
                return 339;
            case 339:
                return 340;
            case 340:
                return 341;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 346:
                return 347;
            case 347:
                return 348;
            case 348:
                return 349;
            case 349:
                return 350;
            case 350:
                return 351;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
            case 354:
                return 355;
            case 355:
                return 356;
            case 356:
                return 357;
            case 357:
                return 358;
            case 358:
                return 359;
            case 359:
                return 360;
            case 360:
                return 361;
            case 361:
                return 362;
            case 362:
                return 363;
            case 363:
                return 364;
            case 364:
                return 365;
            case 365:
                return 366;
            case 366:
                return 367;
            case 367:
                return 368;
            case 368:
                return 369;
            case 369:
                return 370;
            case 370:
                return 371;
            case 371:
                return 372;
            case 372:
                return 373;
            case 374:
                return 375;
            case 375:
                return 376;
            case 376:
                return 377;
            case 377:
                return 378;
            case 378:
                return 379;
            case 379:
                return 380;
            case 380:
                return 381;
            case 381:
                return 382;
            case 382:
                return 383;
            case 383:
                return 384;
            case 384:
                return 385;
            case 385:
                return 386;
            case 386:
                return 387;
            case 387:
                return 388;
            case 388:
                return 389;
            case 389:
                return 390;
            case 390:
                return 391;
            case 391:
                return 392;
            case 392:
                return 393;
            case 393:
                return 394;
            case 394:
                return 395;
            case 395:
                return 396;
            case 396:
                return 397;
            case 397:
                return 398;
            case 398:
                return 399;
            case 399:
                return 400;
            case 400:
                return 401;
            case 401:
                return 402;
            case 402:
                return 403;
            case 403:
                return 404;
            case 404:
                return 405;
            case 405:
                return 406;
            case 406:
                return 407;
            case 407:
                return 408;
            case 408:
                return 409;
            case 409:
                return 410;
            case 410:
                return 411;
            case 411:
                return 412;
            case 412:
                return 413;
            case 414:
                return 415;
            case 415:
                return 416;
            case 416:
                return 417;
            case 417:
                return 418;
            case 418:
                return 419;
            case 419:
                return 420;
            case 420:
                return 421;
            case 421:
                return 422;
            case 422:
                return 423;
            case 424:
                return 425;
            case 426:
                return 427;
            case 427:
                return 428;
            case 428:
                return 429;
            case 429:
                return 430;
            case 430:
                return 431;
            case 431:
                return 432;
            case 432:
                return 433;
            case 433:
                return 434;
            case 434:
                return 435;
            case 435:
                return 436;
            case 436:
                return 437;
            case 437:
                return 438;
            case 438:
                return 439;
            case 439:
                return 440;
            case 440:
                return 441;
            case 441:
                return 442;
            case 442:
                return 443;
            case 443:
                return 444;
            case 444:
                return 445;
            case 445:
                return 446;
            case 446:
                return 447;
            case 447:
                return 448;
            case 448:
                return 449;
            case 449:
                return 450;
            case 450:
                return 451;
            case 451:
                return 452;
            case 452:
                return 453;
            case 453:
                return 454;
            case 454:
                return 455;
            case 455:
                return 456;
            case 456:
                return 457;
            case 457:
                return 458;
            case 458:
                return 459;
            case 459:
                return 460;
            case 460:
                return 461;
            case 461:
                return 462;
            case 463:
                return 464;
            case 464:
                return 465;
            case 465:
                return 466;
            case 466:
                return 467;
            case 467:
                return 468;
            case 468:
                return 469;
            case 469:
                return 470;
            case 470:
                return 471;
            case 471:
                return 472;
            case 472:
                return 473;
            case 473:
                return 474;
            case 474:
                return 475;
            case 475:
                return 476;
            case 476:
                return 477;
            case 477:
                return 478;
            case 478:
                return 479;
            case 479:
                return 480;
            case 480:
                return 481;
            case 481:
                return 482;
            case 482:
                return 483;
            case 483:
                return 484;
            case 484:
                return 485;
            case 485:
                return 486;
            case 486:
                return 487;
            case 487:
                return 488;
            case 488:
                return 489;
            case 489:
                return 490;
            case 490:
                return 491;
            case 491:
                return 492;
            case 492:
                return 493;
            case 493:
                return 494;
            case 494:
                return 495;
            case 495:
                return 496;
            case 496:
                return 497;
            case 497:
                return 498;
            case 498:
                return 499;
            case 499:
                return 500;
            case 500:
                return 501;
            case 501:
                return 502;
            case 502:
                return 503;
            case 503:
                return 504;
            case 504:
                return 505;
            case 505:
                return 506;
            case 506:
                return 507;
            case 507:
                return 508;
            case 508:
                return 509;
            case 509:
                return 510;
            case 510:
                return 511;
            case 511:
                return 512;
            case 512:
                return 513;
            case 513:
                return 514;
            case 514:
                return 515;
            case 515:
                return 516;
            case 516:
                return 517;
            case 517:
                return 518;
            case 518:
                return 519;
            case 519:
                return 520;
            case 520:
                return 521;
            case 521:
                return 522;
            case 522:
                return 523;
            case 523:
                return 524;
            case 524:
                return 525;
            case 525:
                return 526;
            case 526:
                return 527;
            case 527:
                return 528;
            case 528:
                return 529;
            case 529:
                return 530;
            case 530:
                return 531;
            case 531:
                return 532;
            case 532:
                return 533;
            case 535:
                return 536;
            case 536:
                return 537;
            case 537:
                return 538;
            case 538:
                return 539;
            case 539:
                return 540;
            case 540:
                return 541;
            case 541:
                return 542;
            case 542:
                return 543;
            case 543:
                return 544;
            case 546:
                return 547;
            case 547:
                return 548;
            case 548:
                return 549;
            case 549:
                return 550;
            case 550:
                return 551;
            case 551:
                return 552;
            case 552:
                return 553;
            case 553:
                return 554;
            case 554:
                return 555;
            case 555:
                return 556;
            case 556:
                return 557;
            case 557:
                return 558;
            case 558:
                return 559;
            case 559:
                return 560;
            case 560:
                return 561;
            case 561:
                return 562;
            case 562:
                return 563;
            case 563:
                return 564;
            case 564:
                return 565;
            case 565:
                return 566;
            case 566:
                return 567;
            case 567:
                return 568;
            case 568:
                return 569;
            case 569:
                return 570;
            case 570:
                return 571;
            case 571:
                return 572;
            case 572:
                return 573;
            case 573:
                return 574;
            case 574:
                return 575;
            case 575:
                return 576;
            case 576:
                return 577;
            case 578:
                return 579;
            case 579:
                return 580;
            case 580:
                return 581;
            case 581:
                return 582;
            case 582:
                return 583;
            case 583:
                return 584;
            case 584:
                return 585;
            case 585:
                return 586;
            case 586:
                return 587;
            case 587:
                return 588;
            case 588:
                return 589;
            case 589:
                return 590;
            case 590:
                return 591;
            case 591:
                return 592;
            case 592:
                return 593;
            case 593:
                return 594;
            case 594:
                return 595;
            case 595:
                return 596;
            case 596:
                return 597;
            case 597:
                return 598;
            case 598:
                return 599;
            case 599:
                return 600;
        }
    }

    public static int ae(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                return 25;
            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return 26;
            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return 27;
            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                return 28;
            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                return 29;
            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                return 30;
            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                return 31;
            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                return 32;
            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                return 33;
            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                return 34;
            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                return 35;
            case 35:
                return 36;
            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                return 37;
            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                return 38;
            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                return 39;
            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                return 40;
            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                return 41;
            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                return 42;
            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                return 43;
            case R.styleable.TextInputLayout_helperText /* 43 */:
                return 44;
            case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                return 45;
            case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                return 46;
            case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                return 47;
            case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                return 48;
            case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                return 49;
            case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                return 50;
            case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                return 51;
            case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                return 52;
            case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                return 53;
            case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                return 54;
            case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                return 55;
            case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                return 56;
            case R.styleable.TextInputLayout_placeholderText /* 56 */:
                return 57;
            case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                return 58;
            case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                return 59;
            case R.styleable.TextInputLayout_prefixText /* 59 */:
                return 60;
            case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                return 61;
            case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                return 62;
            case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                return 63;
            case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                return 64;
            case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                return 65;
            case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                return 66;
            case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                return 67;
            case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                return 68;
            case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                return 69;
            case R.styleable.TextInputLayout_startIconTint /* 69 */:
                return 70;
            case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                return 71;
            case R.styleable.TextInputLayout_suffixText /* 71 */:
                return 72;
            case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                return 73;
            case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 142:
            case 143:
            case 144:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 393:
            case 613:
            case 708:
            case 719:
            case 742:
            case 786:
            case 957:
            default:
                return 0;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return 255;
            case 255:
                return 256;
            case 256:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 266:
                return 267;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 276:
                return 277;
            case 277:
                return 278;
            case 278:
                return 279;
            case 279:
                return 280;
            case 280:
                return 281;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
            case 296:
                return 297;
            case 297:
                return 298;
            case 298:
                return 299;
            case 299:
                return 300;
            case 300:
                return 301;
            case 301:
                return 302;
            case 302:
                return 303;
            case 303:
                return 304;
            case 304:
                return 305;
            case 305:
                return 306;
            case 306:
                return 307;
            case 307:
                return 308;
            case 308:
                return 309;
            case 309:
                return 310;
            case 310:
                return 311;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 316:
                return 317;
            case 317:
                return 318;
            case 318:
                return 319;
            case 319:
                return 320;
            case 320:
                return 321;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 326:
                return 327;
            case 327:
                return 328;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 335:
                return 336;
            case 336:
                return 337;
            case 337:
                return 338;
            case 338:
                return 339;
            case 339:
                return 340;
            case 340:
                return 341;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 346:
                return 347;
            case 347:
                return 348;
            case 348:
                return 349;
            case 349:
                return 350;
            case 350:
                return 351;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
            case 354:
                return 355;
            case 355:
                return 356;
            case 356:
                return 357;
            case 357:
                return 358;
            case 358:
                return 359;
            case 359:
                return 360;
            case 360:
                return 361;
            case 361:
                return 362;
            case 362:
                return 363;
            case 363:
                return 364;
            case 364:
                return 365;
            case 365:
                return 366;
            case 366:
                return 367;
            case 367:
                return 368;
            case 368:
                return 369;
            case 369:
                return 370;
            case 370:
                return 371;
            case 371:
                return 372;
            case 372:
                return 373;
            case 373:
                return 374;
            case 374:
                return 375;
            case 375:
                return 376;
            case 376:
                return 377;
            case 377:
                return 378;
            case 378:
                return 379;
            case 379:
                return 380;
            case 380:
                return 381;
            case 381:
                return 382;
            case 382:
                return 383;
            case 383:
                return 384;
            case 384:
                return 385;
            case 385:
                return 386;
            case 386:
                return 387;
            case 387:
                return 388;
            case 388:
                return 389;
            case 389:
                return 390;
            case 390:
                return 391;
            case 391:
                return 392;
            case 392:
                return 393;
            case 394:
                return 395;
            case 395:
                return 396;
            case 396:
                return 397;
            case 397:
                return 398;
            case 398:
                return 399;
            case 399:
                return 400;
            case 400:
                return 401;
            case 401:
                return 402;
            case 402:
                return 403;
            case 403:
                return 404;
            case 404:
                return 405;
            case 405:
                return 406;
            case 406:
                return 407;
            case 407:
                return 408;
            case 408:
                return 409;
            case 409:
                return 410;
            case 410:
                return 411;
            case 411:
                return 412;
            case 412:
                return 413;
            case 413:
                return 414;
            case 414:
                return 415;
            case 415:
                return 416;
            case 416:
                return 417;
            case 417:
                return 418;
            case 418:
                return 419;
            case 419:
                return 420;
            case 420:
                return 421;
            case 421:
                return 422;
            case 422:
                return 423;
            case 423:
                return 424;
            case 424:
                return 425;
            case 425:
                return 426;
            case 426:
                return 427;
            case 427:
                return 428;
            case 428:
                return 429;
            case 429:
                return 430;
            case 430:
                return 431;
            case 431:
                return 432;
            case 432:
                return 433;
            case 433:
                return 434;
            case 434:
                return 435;
            case 435:
                return 436;
            case 436:
                return 437;
            case 437:
                return 438;
            case 438:
                return 439;
            case 439:
                return 440;
            case 440:
                return 441;
            case 441:
                return 442;
            case 442:
                return 443;
            case 443:
                return 444;
            case 444:
                return 445;
            case 445:
                return 446;
            case 446:
                return 447;
            case 447:
                return 448;
            case 448:
                return 449;
            case 449:
                return 450;
            case 450:
                return 451;
            case 451:
                return 452;
            case 452:
                return 453;
            case 453:
                return 454;
            case 454:
                return 455;
            case 455:
                return 456;
            case 456:
                return 457;
            case 457:
                return 458;
            case 458:
                return 459;
            case 459:
                return 460;
            case 460:
                return 461;
            case 461:
                return 462;
            case 462:
                return 463;
            case 463:
                return 464;
            case 464:
                return 465;
            case 465:
                return 466;
            case 466:
                return 467;
            case 467:
                return 468;
            case 468:
                return 469;
            case 469:
                return 470;
            case 470:
                return 471;
            case 471:
                return 472;
            case 472:
                return 473;
            case 473:
                return 474;
            case 474:
                return 475;
            case 475:
                return 476;
            case 476:
                return 477;
            case 477:
                return 478;
            case 478:
                return 479;
            case 479:
                return 480;
            case 480:
                return 481;
            case 481:
                return 482;
            case 482:
                return 483;
            case 483:
                return 484;
            case 484:
                return 485;
            case 485:
                return 486;
            case 486:
                return 487;
            case 487:
                return 488;
            case 488:
                return 489;
            case 489:
                return 490;
            case 490:
                return 491;
            case 491:
                return 492;
            case 492:
                return 493;
            case 493:
                return 494;
            case 494:
                return 495;
            case 495:
                return 496;
            case 496:
                return 497;
            case 497:
                return 498;
            case 498:
                return 499;
            case 499:
                return 500;
            case 500:
                return 501;
            case 501:
                return 502;
            case 502:
                return 503;
            case 503:
                return 504;
            case 504:
                return 505;
            case 505:
                return 506;
            case 506:
                return 507;
            case 507:
                return 508;
            case 508:
                return 509;
            case 509:
                return 510;
            case 510:
                return 511;
            case 511:
                return 512;
            case 512:
                return 513;
            case 513:
                return 514;
            case 514:
                return 515;
            case 515:
                return 516;
            case 516:
                return 517;
            case 517:
                return 518;
            case 518:
                return 519;
            case 519:
                return 520;
            case 520:
                return 521;
            case 521:
                return 522;
            case 522:
                return 523;
            case 523:
                return 524;
            case 524:
                return 525;
            case 525:
                return 526;
            case 526:
                return 527;
            case 527:
                return 528;
            case 528:
                return 529;
            case 529:
                return 530;
            case 530:
                return 531;
            case 531:
                return 532;
            case 532:
                return 533;
            case 533:
                return 534;
            case 534:
                return 535;
            case 535:
                return 536;
            case 536:
                return 537;
            case 537:
                return 538;
            case 538:
                return 539;
            case 539:
                return 540;
            case 540:
                return 541;
            case 541:
                return 542;
            case 542:
                return 543;
            case 543:
                return 544;
            case 544:
                return 545;
            case 545:
                return 546;
            case 546:
                return 547;
            case 547:
                return 548;
            case 548:
                return 549;
            case 549:
                return 550;
            case 550:
                return 551;
            case 551:
                return 552;
            case 552:
                return 553;
            case 553:
                return 554;
            case 554:
                return 555;
            case 555:
                return 556;
            case 556:
                return 557;
            case 557:
                return 558;
            case 558:
                return 559;
            case 559:
                return 560;
            case 560:
                return 561;
            case 561:
                return 562;
            case 562:
                return 563;
            case 563:
                return 564;
            case 564:
                return 565;
            case 565:
                return 566;
            case 566:
                return 567;
            case 567:
                return 568;
            case 568:
                return 569;
            case 569:
                return 570;
            case 570:
                return 571;
            case 571:
                return 572;
            case 572:
                return 573;
            case 573:
                return 574;
            case 574:
                return 575;
            case 575:
                return 576;
            case 576:
                return 577;
            case 577:
                return 578;
            case 578:
                return 579;
            case 579:
                return 580;
            case 580:
                return 581;
            case 581:
                return 582;
            case 582:
                return 583;
            case 583:
                return 584;
            case 584:
                return 585;
            case 585:
                return 586;
            case 586:
                return 587;
            case 587:
                return 588;
            case 588:
                return 589;
            case 589:
                return 590;
            case 590:
                return 591;
            case 591:
                return 592;
            case 592:
                return 593;
            case 593:
                return 594;
            case 594:
                return 595;
            case 595:
                return 596;
            case 596:
                return 597;
            case 597:
                return 598;
            case 598:
                return 599;
            case 599:
                return 600;
            case 600:
                return 601;
            case 601:
                return 602;
            case 602:
                return 603;
            case 603:
                return 604;
            case 604:
                return 605;
            case 605:
                return 606;
            case 606:
                return 607;
            case 607:
                return 608;
            case 608:
                return 609;
            case 609:
                return 610;
            case 610:
                return 611;
            case 611:
                return 612;
            case 612:
                return 613;
            case 614:
                return 615;
            case 615:
                return 616;
            case 616:
                return 617;
            case 617:
                return 618;
            case 618:
                return 619;
            case 619:
                return 620;
            case 620:
                return 621;
            case 621:
                return 622;
            case 622:
                return 623;
            case 623:
                return 624;
            case 624:
                return 625;
            case 625:
                return 626;
            case 626:
                return 627;
            case 627:
                return 628;
            case 628:
                return 629;
            case 629:
                return 630;
            case 630:
                return 631;
            case 631:
                return 632;
            case 632:
                return 633;
            case 633:
                return 634;
            case 634:
                return 635;
            case 635:
                return 636;
            case 636:
                return 637;
            case 637:
                return 638;
            case 638:
                return 639;
            case 639:
                return 640;
            case 640:
                return 641;
            case 641:
                return 642;
            case 642:
                return 643;
            case 643:
                return 644;
            case 644:
                return 645;
            case 645:
                return 646;
            case 646:
                return 647;
            case 647:
                return 648;
            case 648:
                return 649;
            case 649:
                return 650;
            case 650:
                return 651;
            case 651:
                return 652;
            case 652:
                return 653;
            case 653:
                return 654;
            case 654:
                return 655;
            case 655:
                return 656;
            case 656:
                return 657;
            case 657:
                return 658;
            case 658:
                return 659;
            case 659:
                return 660;
            case 660:
                return 661;
            case 661:
                return 662;
            case 662:
                return 663;
            case 663:
                return 664;
            case 664:
                return 665;
            case 665:
                return 666;
            case 666:
                return 667;
            case 667:
                return 668;
            case 668:
                return 669;
            case 669:
                return 670;
            case 670:
                return 671;
            case 671:
                return 672;
            case 672:
                return 673;
            case 673:
                return 674;
            case 674:
                return 675;
            case 675:
                return 676;
            case 676:
                return 677;
            case 677:
                return 678;
            case 678:
                return 679;
            case 679:
                return 680;
            case 680:
                return 681;
            case 681:
                return 682;
            case 682:
                return 683;
            case 683:
                return 684;
            case 684:
                return 685;
            case 685:
                return 686;
            case 686:
                return 687;
            case 687:
                return 688;
            case 688:
                return 689;
            case 689:
                return 690;
            case 690:
                return 691;
            case 691:
                return 692;
            case 692:
                return 693;
            case 693:
                return 694;
            case 694:
                return 695;
            case 695:
                return 696;
            case 696:
                return 697;
            case 697:
                return 698;
            case 698:
                return 699;
            case 699:
                return 700;
            case 700:
                return 701;
            case 701:
                return 702;
            case 702:
                return 703;
            case 703:
                return 704;
            case 704:
                return 705;
            case 705:
                return 706;
            case 706:
                return 707;
            case 707:
                return 708;
            case 709:
                return 710;
            case 710:
                return 711;
            case 711:
                return 712;
            case 712:
                return 713;
            case 713:
                return 714;
            case 714:
                return 715;
            case 715:
                return 716;
            case 716:
                return 717;
            case 717:
                return 718;
            case 718:
                return 719;
            case 720:
                return 721;
            case 721:
                return 722;
            case 722:
                return 723;
            case 723:
                return 724;
            case 724:
                return 725;
            case 725:
                return 726;
            case 726:
                return 727;
            case 727:
                return 728;
            case 728:
                return 729;
            case 729:
                return 730;
            case 730:
                return 731;
            case 731:
                return 732;
            case 732:
                return 733;
            case 733:
                return 734;
            case 734:
                return 735;
            case 735:
                return 736;
            case 736:
                return 737;
            case 737:
                return 738;
            case 738:
                return 739;
            case 739:
                return 740;
            case 740:
                return 741;
            case 741:
                return 742;
            case 743:
                return 744;
            case 744:
                return 745;
            case 745:
                return 746;
            case 746:
                return 747;
            case 747:
                return 748;
            case 748:
                return 749;
            case 749:
                return 750;
            case 750:
                return 751;
            case 751:
                return 752;
            case 752:
                return 753;
            case 753:
                return 754;
            case 754:
                return 755;
            case 755:
                return 756;
            case 756:
                return 757;
            case 757:
                return 758;
            case 758:
                return 759;
            case 759:
                return 760;
            case 760:
                return 761;
            case 761:
                return 762;
            case 762:
                return 763;
            case 763:
                return 764;
            case 764:
                return 765;
            case 765:
                return 766;
            case 766:
                return 767;
            case 767:
                return 768;
            case 768:
                return 769;
            case 769:
                return 770;
            case 770:
                return 771;
            case 771:
                return 772;
            case 772:
                return 773;
            case 773:
                return 774;
            case 774:
                return 775;
            case 775:
                return 776;
            case 776:
                return 777;
            case 777:
                return 778;
            case 778:
                return 779;
            case 779:
                return 780;
            case 780:
                return 781;
            case 781:
                return 782;
            case 782:
                return 783;
            case 783:
                return 784;
            case 784:
                return 785;
            case 785:
                return 786;
            case 787:
                return 788;
            case 788:
                return 789;
            case 789:
                return 790;
            case 790:
                return 791;
            case 791:
                return 792;
            case 792:
                return 793;
            case 793:
                return 794;
            case 794:
                return 795;
            case 795:
                return 796;
            case 796:
                return 797;
            case 797:
                return 798;
            case 798:
                return 799;
            case 799:
                return 800;
            case 800:
                return 801;
            case 801:
                return 802;
            case 802:
                return 803;
            case 803:
                return 804;
            case 804:
                return 805;
            case 805:
                return 806;
            case 806:
                return 807;
            case 807:
                return 808;
            case 808:
                return 809;
            case 809:
                return 810;
            case 810:
                return 811;
            case 811:
                return 812;
            case 812:
                return 813;
            case 813:
                return 814;
            case 814:
                return 815;
            case 815:
                return 816;
            case 816:
                return 817;
            case 817:
                return 818;
            case 818:
                return 819;
            case 819:
                return 820;
            case 820:
                return 821;
            case 821:
                return 822;
            case 822:
                return 823;
            case 823:
                return 824;
            case 824:
                return 825;
            case 825:
                return 826;
            case 826:
                return 827;
            case 827:
                return 828;
            case 828:
                return 829;
            case 829:
                return 830;
            case 830:
                return 831;
            case 831:
                return 832;
            case 832:
                return 833;
            case 833:
                return 834;
            case 834:
                return 835;
            case 835:
                return 836;
            case 836:
                return 837;
            case 837:
                return 838;
            case 838:
                return 839;
            case 839:
                return 840;
            case 840:
                return 841;
            case 841:
                return 842;
            case 842:
                return 843;
            case 843:
                return 844;
            case 844:
                return 845;
            case 845:
                return 846;
            case 846:
                return 847;
            case 847:
                return 848;
            case 848:
                return 849;
            case 849:
                return 850;
            case 850:
                return 851;
            case 851:
                return 852;
            case 852:
                return 853;
            case 853:
                return 854;
            case 854:
                return 855;
            case 855:
                return 856;
            case 856:
                return 857;
            case 857:
                return 858;
            case 858:
                return 859;
            case 859:
                return 860;
            case 860:
                return 861;
            case 861:
                return 862;
            case 862:
                return 863;
            case 863:
                return 864;
            case 864:
                return 865;
            case 865:
                return 866;
            case 866:
                return 867;
            case 867:
                return 868;
            case 868:
                return 869;
            case 869:
                return 870;
            case 870:
                return 871;
            case 871:
                return 872;
            case 872:
                return 873;
            case 873:
                return 874;
            case 874:
                return 875;
            case 875:
                return 876;
            case 876:
                return 877;
            case 877:
                return 878;
            case 878:
                return 879;
            case 879:
                return 880;
            case 880:
                return 881;
            case 881:
                return 882;
            case 882:
                return 883;
            case 883:
                return 884;
            case 884:
                return 885;
            case 885:
                return 886;
            case 886:
                return 887;
            case 887:
                return 888;
            case 888:
                return 889;
            case 889:
                return 890;
            case 890:
                return 891;
            case 891:
                return 892;
            case 892:
                return 893;
            case 893:
                return 894;
            case 894:
                return 895;
            case 895:
                return 896;
            case 896:
                return 897;
            case 897:
                return 898;
            case 898:
                return 899;
            case 899:
                return 900;
            case 900:
                return 901;
            case 901:
                return 902;
            case 902:
                return 903;
            case 903:
                return 904;
            case 904:
                return 905;
            case 905:
                return 906;
            case 906:
                return 907;
            case 907:
                return 908;
            case 908:
                return 909;
            case 909:
                return 910;
            case 910:
                return 911;
            case 911:
                return 912;
            case 912:
                return 913;
            case 913:
                return 914;
            case 914:
                return 915;
            case 915:
                return 916;
            case 916:
                return 917;
            case 917:
                return 918;
            case 918:
                return 919;
            case 919:
                return 920;
            case 920:
                return 921;
            case 921:
                return 922;
            case 922:
                return 923;
            case 923:
                return 924;
            case 924:
                return 925;
            case 925:
                return 926;
            case 926:
                return 927;
            case 927:
                return 928;
            case 928:
                return 929;
            case 929:
                return 930;
            case 930:
                return 931;
            case 931:
                return 932;
            case 932:
                return 933;
            case 933:
                return 934;
            case 934:
                return 935;
            case 935:
                return 936;
            case 936:
                return 937;
            case 937:
                return 938;
            case 938:
                return 939;
            case 939:
                return 940;
            case 940:
                return 941;
            case 941:
                return 942;
            case 942:
                return 943;
            case 943:
                return 944;
            case 944:
                return 945;
            case 945:
                return 946;
            case 946:
                return 947;
            case 947:
                return 948;
            case 948:
                return 949;
            case 949:
                return 950;
            case 950:
                return 951;
            case 951:
                return 952;
            case 952:
                return 953;
            case 953:
                return 954;
            case 954:
                return 955;
            case 955:
                return 956;
            case 956:
                return 957;
            case 958:
                return 959;
            case 959:
                return 960;
            case 960:
                return 961;
            case 961:
                return 962;
            case 962:
                return 963;
            case 963:
                return 964;
            case 964:
                return 965;
            case 965:
                return 966;
            case 966:
                return 967;
            case 967:
                return 968;
            case 968:
                return 969;
            case 969:
                return 970;
            case 970:
                return 971;
            case 971:
                return 972;
            case 972:
                return 973;
            case 973:
                return 974;
            case 974:
                return 975;
            case 975:
                return 976;
            case 976:
                return 977;
            case 977:
                return 978;
            case 978:
                return 979;
            case 979:
                return 980;
            case 980:
                return 981;
            case 981:
                return 982;
            case 982:
                return 983;
            case 983:
                return 984;
            case 984:
                return 985;
            case 985:
                return 986;
            case 986:
                return 987;
            case 987:
                return 988;
            case 988:
                return 989;
            case 989:
                return 990;
            case 990:
                return 991;
            case 991:
                return 992;
            case 992:
                return 993;
            case 993:
                return 994;
            case 994:
                return 995;
            case 995:
                return 996;
            case 996:
                return 997;
            case 997:
                return 998;
            case 998:
                return 999;
            case 999:
                return 1000;
            case 1000:
                return 1001;
            case 1001:
                return 1002;
            case 1002:
                return 1003;
            case 1003:
                return 1004;
            case 1004:
                return 1005;
            case 1005:
                return 1006;
            case 1006:
                return 1007;
            case 1007:
                return 1008;
            case 1008:
                return 1009;
            case 1009:
                return 1010;
            case 1010:
                return 1011;
            case 1011:
                return 1012;
            case 1012:
                return 1013;
            case 1013:
                return 1014;
            case 1014:
                return 1015;
            case 1015:
                return 1016;
            case 1016:
                return 1017;
            case 1017:
                return 1018;
            case 1018:
                return 1019;
            case 1019:
                return 1020;
            case 1020:
                return 1021;
            case 1021:
                return 1022;
            case 1022:
                return 1023;
            case 1023:
                return 1024;
            case 1024:
                return 1025;
            case 1025:
                return 1026;
            case 1026:
                return 1027;
            case 1027:
                return 1028;
            case 1028:
                return 1029;
            case 1029:
                return 1030;
            case 1030:
                return 1031;
            case 1031:
                return 1032;
            case 1032:
                return 1033;
            case 1033:
                return 1034;
            case 1034:
                return 1035;
            case 1035:
                return 1036;
            case 1036:
                return 1037;
            case 1037:
                return 1038;
            case 1038:
                return 1039;
            case 1039:
                return 1040;
            case 1040:
                return 1041;
            case 1041:
                return 1042;
            case 1042:
                return 1043;
            case 1043:
                return 1044;
            case 1044:
                return 1045;
            case 1045:
                return 1046;
            case 1046:
                return 1047;
            case 1047:
                return 1048;
            case 1048:
                return 1049;
            case 1049:
                return 1050;
            case 1050:
                return 1051;
            case 1051:
                return 1052;
            case 1052:
                return 1053;
            case 1053:
                return 1054;
            case 1054:
                return 1055;
            case 1055:
                return 1056;
            case 1056:
                return 1057;
            case 1057:
                return 1058;
            case 1058:
                return 1059;
            case 1059:
                return 1060;
            case 1060:
                return 1061;
            case 1061:
                return 1062;
            case 1062:
                return 1063;
            case 1063:
                return 1064;
            case 1064:
                return 1065;
            case 1065:
                return 1066;
            case 1066:
                return 1067;
            case 1067:
                return 1068;
            case 1068:
                return 1069;
            case 1069:
                return 1070;
            case 1070:
                return 1071;
            case 1071:
                return 1072;
            case 1072:
                return 1073;
            case 1073:
                return 1074;
            case 1074:
                return 1075;
            case 1075:
                return 1076;
            case 1076:
                return 1077;
            case 1077:
                return 1078;
            case 1078:
                return 1079;
            case 1079:
                return 1080;
            case 1080:
                return 1081;
            case 1081:
                return 1082;
            case 1082:
                return 1083;
            case 1083:
                return 1084;
        }
    }

    public static String af(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static double ag(double d) {
        return d / 6371010.0d;
    }

    public static lyw ah(mko mkoVar) {
        return new kvn(new hsp(mkoVar, 7), lkq.class, lkq.class);
    }

    public static void ai(mbg mbgVar, Class cls, boolean z) {
        mbe mbeVar;
        Class<?> cls2;
        boolean z2;
        String str;
        String str2;
        if (z) {
            mbeVar = mbgVar.d;
        } else {
            mbeVar = mbgVar.e;
        }
        try {
            cls2 = ((mkb) mbeVar).c.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (!cls.isAssignableFrom(cls2)) {
            if (true != z) {
                str = "response";
            } else {
                str = "request";
            }
            String str3 = mbgVar.b;
            mca mcaVar = mca.h;
            String name = cls2.getName();
            if (true != z2) {
                str2 = "";
            } else {
                str2 = ", assumed because method doesn't use ReflectableMarshaller";
            }
            throw new mcb(mcaVar.d("AsyncClientInterceptor: The " + str + " message type of method " + str3 + " (" + name + str2 + ") must be a subclass of " + cls.toString()));
        }
    }

    public static ExperimentalCronetEngine.Builder aj(Context context, Set set, Set set2, jer jerVar, jer jerVar2, mko mkoVar) {
        ExperimentalCronetEngine.Builder builder = null;
        if (jerVar.g()) {
            kud kudVar = (kud) jerVar.c();
            if (kudVar.d() != null) {
                context = kudVar.d();
            }
            if (kudVar.e() != null) {
                builder = kudVar.e().a();
            }
        }
        if (builder == null) {
            builder = new ExperimentalCronetEngine.Builder(context);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            builder.addQuicHint(((kug) it.next()).a, 443, 443);
        }
        jer jerVar3 = (jer) ((lsi) mkoVar).b;
        if (jerVar3.g() && set2.isEmpty()) {
            throw new IllegalArgumentException("Google digests were provided, but no hostnames were pinned - this is either a security vulnerability or a waste of APK size. Add hostnames, or remove the dep on google digests.");
        }
        if (!set2.isEmpty() && !jerVar3.g()) {
            throw new IllegalArgumentException("Pinning was requested, but digests weren't provided. Add a dependency on the google digests.");
        }
        if (jerVar2.g()) {
            V(!set2.isEmpty(), "Local trust anchor bypass was specified, but no pinned hostnames were provided.");
            builder.enablePublicKeyPinningBypassForLocalTrustAnchors(((Boolean) jerVar2.c()).booleanValue());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            kuf kufVar = (kuf) it2.next();
            builder.addPublicKeyPins(kufVar.a(), (Set) jerVar3.c(), kufVar.c(), kufVar.b());
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            if (jerVar.g()) {
                kud kudVar2 = (kud) jerVar.c();
                builder.enableQuic(kudVar2.n());
                builder.enableBrotli(kudVar2.i());
                if (kudVar2.h() != null) {
                    builder.setLibraryLoader(kudVar2.h());
                }
                if (kudVar2.f() != null) {
                    builder.setExperimentalOptions(kudVar2.f());
                }
                if (kudVar2.c() != 20) {
                    builder.setThreadPriority(kudVar2.c());
                }
            } else {
                builder.enableQuic(true);
            }
            return builder;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void ak(jer jerVar, ExperimentalCronetEngine.Builder builder) {
        if (jerVar.g()) {
            builder.enableNetworkQualityEstimator(((kud) jerVar.c()).m());
        }
    }

    public static void al(jer jerVar, ExperimentalCronetEngine experimentalCronetEngine, mko mkoVar, mko mkoVar2) {
        if (jerVar.g() && ((kud) jerVar.c()).m()) {
            Iterator it = ((Set) ((lsi) mkoVar).b).iterator();
            while (it.hasNext()) {
                experimentalCronetEngine.addRttListener((NetworkQualityRttListener) it.next());
            }
            Iterator it2 = ((Set) ((lsi) mkoVar2).b).iterator();
            while (it2.hasNext()) {
                experimentalCronetEngine.addThroughputListener((NetworkQualityThroughputListener) it2.next());
            }
        }
    }

    public static void am(jer jerVar, ExperimentalCronetEngine.Builder builder) {
        if (!jerVar.g()) {
            return;
        }
        if (((kud) jerVar.c()).l()) {
            builder.enableHttpCache(1, r2.b());
        } else {
            builder.enableHttpCache(0, 0L);
        }
    }

    public static knu an(String str, String str2) {
        return knu.d(new ktg(str, str2), ktg.class);
    }

    public static knu ao(String str, kth kthVar) {
        knt c = knu.c(ktg.class);
        c.b(new koc(Context.class, 1, 0));
        c.c = new ktj(str, kthVar, 1);
        return c.a();
    }

    public static SharedPreferences ap(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    private static float aq(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String ar(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean as(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    private static String at(int i, int i2, String str) {
        if (i < 0) {
            return I("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.ae(i2, "negative size: "));
    }

    public static void b(jyz jyzVar) {
        jyzVar.c(new hsi(jyzVar, 13), jxv.a);
    }

    public static /* synthetic */ String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "CRITICAL";
                }
                return "LOW";
            }
            return "NORMAL";
        }
        return "UNKNOWN";
    }

    public static String d(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String e(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return d(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(com.google.android.apps.adm.R.id.dummy_placeholder))), j, i);
    }

    public static float f(float f) {
        TimeInterpolator timeInterpolator = inc.a;
        return (f * 0.6f) + 0.4f;
    }

    public static TimeInterpolator h(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!as(valueOf, "cubic-bezier") && !as(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (as(valueOf, "cubic-bezier")) {
                String[] split = ar(valueOf, "cubic-bezier").split(",");
                int length = split.length;
                if (length == 4) {
                    return bza.c(aq(split, 0), aq(split, 1), aq(split, 2), aq(split, 3));
                }
                throw new IllegalArgumentException(a.ae(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
            }
            if (as(valueOf, "path")) {
                return bza.a(bpn.c(ar(valueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static float i(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float j(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float k(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += bwb.a((View) parent);
        }
        return f;
    }

    public static void l(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void m(View view, ise iseVar) {
        bwb.n(view, new isc(iseVar, new isf(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            bvz.c(view);
        } else {
            view.addOnAttachStateChangeListener(new isd());
        }
    }

    public static void n(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean o(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ jis p(Collection collection) {
        collection.getClass();
        jis o = jis.o(collection);
        o.getClass();
        return o;
    }

    public static int q(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int r(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return q(hashCode);
    }

    public static int s(int i, int i2) {
        return i & (~i2);
    }

    public static int t(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int u(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:            if (r4 != (-1)) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:            A(r10, r1, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:            r11[r4] = t(r11[r4], r6, r9);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int v(java.lang.Object r7, java.lang.Object r8, int r9, java.lang.Object r10, int[] r11, java.lang.Object[] r12, java.lang.Object[] r13) {
        /*
            int r0 = r(r7)
            r1 = r0 & r9
            int r2 = w(r10, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r0 = s(r0, r9)
            r4 = -1
        L13:
            int r2 = r2 + r3
            r5 = r11[r2]
            r6 = r5 & r9
            int r5 = s(r5, r9)
            if (r5 != r0) goto L3f
            r5 = r12[r2]
            boolean r5 = defpackage.amr.g(r7, r5)
            if (r5 == 0) goto L3f
            if (r13 == 0) goto L30
            r5 = r13[r2]
            boolean r5 = defpackage.amr.g(r8, r5)
            if (r5 == 0) goto L3f
        L30:
            if (r4 != r3) goto L36
            A(r10, r1, r6)
            goto L3e
        L36:
            r7 = r11[r4]
            int r7 = t(r7, r6, r9)
            r11[r4] = r7
        L3e:
            return r2
        L3f:
            if (r6 == 0) goto L44
            r4 = r2
            r2 = r6
            goto L13
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwx.v(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int w(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static int x(int i) {
        int max = Math.max(i + 1, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
            highestOneBit = 1073741824;
        }
        return Math.max(4, highestOneBit);
    }

    public static Object y(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException(a.ae(i, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void z(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public float g(float f) {
        return 1.0f;
    }

    public hwx(char[] cArr) {
    }

    public hwx(Object obj) {
        obj.getClass();
    }
}
